package model.DAO;

import java.util.ArrayList;
import java.util.List;

import WeaponInfo.Bow;
import WeaponInfo.GreatSword;

public class JdbcGreatSwordDao implements GreatSwordDao{

	public List<GreatSword> getAllGreatSwords() {
		List<GreatSword> allGS = new ArrayList<>();
		
		String sqlGetAll = "SELECT * FROM weapon_type " +
				 		   "JOIN blademaster USING (weapon_type_id) "
				 		   + "JOIN sharpness USING (sharpness_id) "
				 		   + "JOIN elements USING (element_id)"
				 		   + "WHERE weapon_name = 'great sword'";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetAll);
		
		while(result.next()) {
			GreatSword greatSword = mapRowToGreatSword(result);
			allGS.add(greatSword);
		}
		
		return allGS;
	}

	public GreatSword getGreatSwordById(Integer id) {
		GreatSword greatSword = new GreatSword();
		
		String sqlSelectGS = "SELECT * FROM blademaster "
							 + "JOIN sharpness USING (sharpness_id) "
							 + "JOIN elements USING (element_id) "
							 + "WHERE blademaster_id = ?";
		SqlRowSet selectGS = jdbcTemplate.queryForRowSet(sqlSelectGS, id);
		selectGS.next();
		
		greatSword = mapRowToBow(selectGS);
		
		return greatSword;
	}

	public void addGreatSword(GreatSword greatSword) {
		// TODO Auto-generated method stub
		
	}

	public void updateGreatSword(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	private GreatSword mapRowToGreatSword(SqlRowSet rowSet) {
		GreatSword greatSword = new GreatSword();
		
		greatSword.setWeaponName(rowSet.getString("name"));
		greatSword.setRarity(rowSet.getInteger("rarity"));
		greatSword.setAttack(rowSet.getInteger("attack"));
		greatSword.setAffinity(rowSet.getInteger("affinity"));
		greatSword.setElderseal(rowSet.getDouble("elderseal"));
		greatSword.setSharpnessColor(rowSet.getString("sharpness_name"));
		greatSword.setElement(rowSet.getString("element_name"));
		
		return greatSword;
	}

}
