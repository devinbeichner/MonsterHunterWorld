import java.util.HashMap;
import java.util.Map;

public class GreatSword extends Blademaster {

    private String weaponType;

    Map<String, Double> motionValues = new HashMap<String, Double>();

    public GreatSword(String weaponName, int rarity, int attack, int affinity, int elderseal, String sharpnessColor, String element){
        super(weaponName, rarity, attack, affinity, elderseal, sharpnessColor, element);
        this.weaponType = "severing";
        motionValues.put("Verticle Slash", 0.48);
        motionValues.put("Rising Slash", 0.38);
        motionValues.put("Cleave", 0.26);
        motionValues.put("Tackle", 0.26);
        motionValues.put("Charge II Tackle", 0.35);
        motionValues.put("Charge III Tackle", 0.48);
        motionValues.put("Diving Cleave", 0.71);
        motionValues.put("Charge II Diving Cleave", 0.85);
        motionValues.put("Charge III Diving Cleave", 1.1);
        motionValues.put("Side Strike", 0.15);
        motionValues.put("Charge Slash I ", 0.48);
        motionValues.put("Charge Slash II ", 0.70);
        motionValues.put("Charge Slash III", 0.90);
        motionValues.put("Charge Slash Overcharge", 0.70);
        motionValues.put("Strong Charge Slash I", 0.65);
        motionValues.put("Strong Charge Slash II ", 0.82);
        motionValues.put("Strong Charge Slash III ", 0.96);
        motionValues.put("Strong Charge Slash Overcharge", 0.82);
        motionValues.put("Strong Cleave I ", 0.60);
        motionValues.put("Strong Cleave II ", 0.65);
        motionValues.put("Strong Cleave III", 0.79);
        motionValues.put("Strong Cleave Overcharge", 0.65);
        motionValues.put("True Charge Slash I (first hit)", 0.20);
        motionValues.put("True Charge Slash I (second hit)", 0.182);
        motionValues.put("True Charge Slash II (first hit)", 0.20);
        motionValues.put("True Charge Slash II (second hit)", 0.182);
        motionValues.put("True Charge Slash III (first hit)", 0.21);
        motionValues.put("True Charge Slash III (second hit)", 0.210);
        motionValues.put("True Charge Slash Overcharge (first hit)", 0.20);
        motionValues.put("True Charge Slash Overcharge (second hit)", 1.82);
        motionValues.put("Kick", .04);
        motionValues.put("Jump Slash", 0.69);
        motionValues.put("Jump Charge Slash I ", 0.69);
        motionValues.put("Jump Charge Slash II", 0.85);
        motionValues.put("Jump Charge Slash III", 0.104);
        motionValues.put("Rising Charge Slash I", 0.48);
        motionValues.put("Rising Charge Slash II ", 0.73);
        motionValues.put("Rising Charge Slash III", 1.0);
        motionValues.put("Falling Thrust I", 0.14);
        motionValues.put("Falling Thrust II", 0.21);
        motionValues.put("Falling Thrust III ", 0.26);
    }

    protected void trueDamage(){
        this.trueDamage = this.getAttack()/4.8;
    }
    

    public String getWeaponType(){
        return weaponType;
    }
}
