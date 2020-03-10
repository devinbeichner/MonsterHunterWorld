package model.DAO;

import java.util.List;

import WeaponInfo.GreatSword;

public interface GreatSwordDao {

	public List<GreatSword> getAllGreatSwords();
	public GreatSword getGreatSwordById(Integer id);
	public void addGreatSword(GreatSword greatSword);
	public void updateGreatSword(Integer id);
	
}
