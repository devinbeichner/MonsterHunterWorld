package model.DAO;

import java.util.ArrayList;
import java.util.List;

import WeaponInfo.Bow;

public class JdbcBowDao implements BowDao{
	

	public List<Bow> getAllBows() {
		
		List<Bow> allBows = new ArrayList<>();
		
		String sqlGetAll = "SELECT * FROM weapon_type " +
				 		   "JOIN gunner USING (weapon_type_id) "
				 		   + "WHERE weapon_name = 'bow'";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetAll);
		
		while(result.next()) {
			Bow bow = mapRowToBow(result);
			allBows.add(bow);
		}
		
		return allBows;
	}

	public Bow getBowById(Integer id) {
		Bow bow = new Bow();
		
		String sqlSelectBow = "SELECT * FROM gunner WHERE gunner_id = ?";
		SqlRowSet selectBow = jdbcTemplate.queryForRowSet(sqlSelectBow, id);
		selectBow.next();
		
		bow = mapRowToBow(selectBow);
		
		return bow;
	}

	public void addBow(Bow bow) {
		// TODO Auto-generated method stub
		
	}

	public void updateBow(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	private Bow mapRowToBow(SqlRowSet rowSet) {
		Bow bow = new Bow();
		
		bow.setWeaponName(rowSet.getString("name"));
		bow.setRarity(rowSet.getInteger("rarity"));
		bow.setAttack(rowSet.getInteger("attack"));
		bow.setAffinity(rowSet.getInteger("affinity"));
		bow.setElderseal(rowSet.getDouble("elderseal"));
		
		List<String> coating = new ArrayList<>();
		String sqlGetCoatings = "SELECT ammo_name FROM ammo "
								+ "JOIN gunner_ammo USING (ammo_id) "
								+ "JOIN gunner USING (gunner_id) "
								+ "WHERE gunner_id = "
								+ rowSet.getInteger("gunner_id");
		SqlRowSet allCoatings = jdbcTemplate.queryForRowSet(sqlGetCoatings);
		while (allCoatings.next()) {
			coating.add("ammo_name");
		}
		bow.setCoatings(coating);
		
		return bow;
	}

}
