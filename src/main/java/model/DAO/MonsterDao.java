package model.DAO;

import java.util.List;

import MonsterInfo.Monster;

public interface MonsterDao {

	public List<Monster> getAllMonsters();
	public Monster getMonsterById(Integer id);
	public void addMonster(Monster monster);
	public void updateMonster(Integer id);
	
}
