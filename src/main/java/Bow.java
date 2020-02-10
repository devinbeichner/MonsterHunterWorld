import java.util.HashMap;
import java.util.Map;

public class Bow extends Weapon {

    private String ammoElement;

    {
        this.motionValues.put("Shoot", 0.08);
        this.motionValues.put("Charge I (Two hits)", 0.1);
        this.motionValues.put("Charge II (Three hits)", 0.11);
        this.motionValues.put("Quick Shot (Three hits)", 0.06);
        this.motionValues.put("Charge Step Power Shot (Five hits)", 0.13);
        this.motionValues.put("Diving Melee Attack", 0.35);
        this.motionValues.put("Jump Melee Attack", 0.05);
        this.motionValues.put("High-Angle Shot (Up to 6 hits)", 0.01);
        this.motionValues.put("Charge I High-Angle Shot (Up to 8 hits)", 0.01);
        this.motionValues.put("Charge II High-Angle Shot (Up to 14 hits)", 0.03);
        this.motionValues.put("Wyvern's Arrow (Variable amount of hits)", 0.23);
        this.motionValues.put("Charge I Wyvern's Arrow (Variable amount of hits)", 0.24);
        this.motionValues.put("Charge II Wyvern's Arrow (Variable amount of hits)", 0.26);
    }

    public Bow(String weaponName, int rarity, int attack, int affinity, int elderseal){
        super(weaponName, rarity, attack, affinity, elderseal);
        this.damageType = "projectile";
    }

    protected void trueDamage(){
        this.trueDamage = getAttack()/1.2;
    }

    public String getAmmoElement(){
        return ammoElement;
    }
    public void setAmmoElement(String ammoElement){
        this.ammoElement = ammoElement;
    }

}
