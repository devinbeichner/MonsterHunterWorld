package WeaponInfo;

import java.util.HashMap;
import java.util.Map;

public abstract class Weapon {
    private String weaponName;
    private int rarity;
    private int attack;
    private double affinity;
    private double elderseal;
    protected String damageType;
    protected double trueDamage;
    protected Map<String, Double> motionValues = new HashMap<String, Double>();

    public Weapon() {};
    
    public Weapon(String weaponName, int rarity, int attack, int affinity, int elderseal){
        this.weaponName = weaponName;
        this.rarity = rarity;
        this.attack = attack;
        this.affinity = affinity / 100.0;
        this.elderseal = elderseal /100.0;
    }

    protected abstract void trueDamage();

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public double getAffinity() {
		return affinity;
	}

	public void setAffinity(double affinity) {
		this.affinity = affinity;
	}

	public double getElderseal() {
		return elderseal;
	}

	public void setElderseal(double elderseal) {
		this.elderseal = elderseal;
	}

	public String getDamageType() {
		return damageType;
	}

	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}

	public double getTrueDamage() {
		return trueDamage;
	}

	public void setTrueDamage(double trueDamage) {
		this.trueDamage = trueDamage;
	}

	public Map<String, Double> getMotionValues() {
		return motionValues;
	}

	public void setMotionValues(Map<String, Double> motionValues) {
		this.motionValues = motionValues;
	}

    
}
