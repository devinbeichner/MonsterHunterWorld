package model.DAO;

import java.util.List;

import WeaponInfo.Bow;

public interface BowDao {

	public List<Bow> getAllBows();
	public Bow getBowById(Integer id);
	public void addBow(Bow bow);
	public void updateBow (Integer id);
	
}
