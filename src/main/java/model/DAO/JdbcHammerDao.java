package model.DAO;

import java.util.ArrayList;
import java.util.List;

import WeaponInfo.GreatSword;
import WeaponInfo.Hammer;

public class JdbcHammerDao implements HammerDao{

	public List<Hammer> getAllHammers() {
		List<Hammer> allHammers = new ArrayList<>();
		
		String sqlGetAll = "SELECT * FROM weapon_type " +
				 		   "JOIN blademaster USING (weapon_type_id) "
				 		   + "JOIN sharpness USING (sharpness_id) "
				 		   + "JOIN elements USING (element_id)"
				 		   + "WHERE weapon_name = 'hammer'";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetAll);
		
		while(result.next()) {
			Hammer hammer = mapRowToGreatHammer(result);
			allHammers.add(hammer);
		}
		
		return allHammers;
	}

	public Hammer getHammerById(Integer id) {
		Hammer hammer = new Hammer();
		
		String sqlSelectHammer = "SELECT * FROM blademaster "
							 + "JOIN sharpness USING (sharpness_id) "
							 + "JOIN elements USING (element_id) "
							 + "WHERE blademaster_id = ?";
		SqlRowSet selectHammer = jdbcTemplate.queryForRowSet(sqlSelectHammer, id);
		selectHammer.next();
		
		hammer = mapRowToBow(selectHammer);
		
		return hammer;
	}

	public void addHammer(Hammer hammer) {
		// TODO Auto-generated method stub
		
	}

	public void updateHammer(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	private Hammer mapRowToHammer(SqlRowSet rowSet) {
		Hammer hammer = new Hammer();
		
		hammer.setWeaponName(rowSet.getString("name"));
		hammer.setRarity(rowSet.getInteger("rarity"));
		hammer.setAttack(rowSet.getInteger("attack"));
		hammer.setAffinity(rowSet.getInteger("affinity"));
		hammer.setElderseal(rowSet.getDouble("elderseal"));
		hammer.setSharpnessColor(rowSet.getString("sharpness_name"));
		hammer.setElement(rowSet.getString("element_name"));
		
		return hammer;
	}

}
