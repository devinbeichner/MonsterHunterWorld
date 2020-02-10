import java.util.HashMap;
import java.util.Map;

public class Hammer extends Blademaster {

    {
        this.motionValues.put("Unsheathe Attack", 0.20);
        this.motionValues.put("Return Swing", 0.16);
        this.motionValues.put("Side Smash", 0.15);
        this.motionValues.put("Ground Smash I", 0.37);
        this.motionValues.put("Ground Smash II", 0.22);
        this.motionValues.put("Upswing", 0.86);
        this.motionValues.put("Aerial Unsheathe Attack", 0.36);
        this.motionValues.put("Aerial Attack (Charge Lv 1)", 0.62);
        this.motionValues.put("Aerial Attack (Charge Lv 2)", 0.66);
        this.motionValues.put("Aerial Attack (Charge Lv 3)", 0.79);
        this.motionValues.put("Strike First Step", 0.28);
        this.motionValues.put("Strike Second Step", 0.32);
        this.motionValues.put("Strike Third Step", 0.45);
        this.motionValues.put("Strike Fourth Step", 0.65);
        this.motionValues.put("Strike Finish (First two hits)", 0.28);
        this.motionValues.put("Strike Finish (Last hit)", 1.0);
        this.motionValues.put("Rising Smash (Charge Lv 1)", 0.19);
        this.motionValues.put("Charge Return Swing", 0.25);
        this.motionValues.put("Charge Return Swing(During power store)", 0.58);
        this.motionValues.put("Uppercut Smash (Charge Lv 2)", 0.38);
        this.motionValues.put("Superpound (Charge Lv 3, first hit)", 0.15);
        this.motionValues.put("Superpound (Charge Lv 3, second hit)", 0.76);
        this.motionValues.put("Spinning Bludgeon (First hit)", 0.28);
        this.motionValues.put("Spinning Bludgeon (Second to sixth hit)", 0.19);
        this.motionValues.put("Spinning Side Swing", 0.15);
        this.motionValues.put("Spinning Bludgeon Hook", 0.56);
        this.motionValues.put("Spinning Bludgeon Slam", 0.32);
        this.motionValues.put("Spinning Bludgeon Upswing", 0.86);
        this.motionValues.put("Strong Charge Strike (First two hits)", 0.16);
        this.motionValues.put("Strong Charge Strike(Last Hit)", 0.86);
        this.motionValues.put("Strong Charge Upper", 0.48);
        this.motionValues.put("Aerial Spinning Bludgeon (Each in air hit)", 0.30);
        this.motionValues.put("Aerial Spinning Bludgeon (Last hit)", 1.0);
    }

    public Hammer(String weaponName, int rarity, int attack, int affinity, int elderseal, String sharpnessColor, String element){
        super(weaponName, rarity, attack, affinity, elderseal, sharpnessColor, element);
        this.damageType = "impact";
    }

    protected void trueDamage(){
        this.trueDamage = this.getAttack()/5.2;
    }

}
