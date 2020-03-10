package model.DAO;

import java.util.List;

import WeaponInfo.Hammer;

public interface HammerDao {
	
	public List<Hammer> getAllHammers();
	public Hammer getHammerById(Integer id);
	public void addHammer(Hammer hammer);
	public void updateHammer(Integer id);

}
