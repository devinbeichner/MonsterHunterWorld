import java.util.HashMap;
import java.util.Map;

public class GreatSword extends Blademaster {
    {
        this.motionValues.put("Verticle Slash", 0.48);
        this.motionValues.put("Rising Slash", 0.38);
        this.motionValues.put("Cleave", 0.26);
        this.motionValues.put("Tackle", 0.26);
        this.motionValues.put("Charge II Tackle", 0.35);
        this.motionValues.put("Charge III Tackle", 0.48);
        this.motionValues.put("Diving Cleave", 0.71);
        this.motionValues.put("Charge II Diving Cleave", 0.85);
        this.motionValues.put("Charge III Diving Cleave", 1.1);
        this.motionValues.put("Side Strike", 0.15);
        this.motionValues.put("Charge Slash I ", 0.48);
        this.motionValues.put("Charge Slash II ", 0.70);
        this.motionValues.put("Charge Slash III", 0.90);
        this.motionValues.put("Charge Slash Overcharge", 0.70);
        this.motionValues.put("Strong Charge Slash I", 0.65);
        this.motionValues.put("Strong Charge Slash II ", 0.82);
        this.motionValues.put("Strong Charge Slash III ", 0.96);
        this.motionValues.put("Strong Charge Slash Overcharge", 0.82);
        this.motionValues.put("Strong Cleave I ", 0.60);
        this.motionValues.put("Strong Cleave II ", 0.65);
        this.motionValues.put("Strong Cleave III", 0.79);
        this.motionValues.put("Strong Cleave Overcharge", 0.65);
        this.motionValues.put("True Charge Slash I (first hit)", 0.20);
        this.motionValues.put("True Charge Slash I (second hit)", 0.182);
        this.motionValues.put("True Charge Slash II (first hit)", 0.20);
        this.motionValues.put("True Charge Slash II (second hit)", 0.182);
        this.motionValues.put("True Charge Slash III (first hit)", 0.21);
        this.motionValues.put("True Charge Slash III (second hit)", 2.10);
        this.motionValues.put("True Charge Slash Overcharge (first hit)", 0.20);
        this.motionValues.put("True Charge Slash Overcharge (second hit)", 1.82);
        this.motionValues.put("Kick", .04);
        this.motionValues.put("Jump Slash", 0.69);
        this.motionValues.put("Jump Charge Slash I ", 0.69);
        this.motionValues.put("Jump Charge Slash II", 0.85);
        this.motionValues.put("Jump Charge Slash III", 0.104);
        this.motionValues.put("Rising Charge Slash I", 0.48);
        this.motionValues.put("Rising Charge Slash II ", 0.73);
        this.motionValues.put("Rising Charge Slash III", 1.0);
        this.motionValues.put("Falling Thrust I", 0.14);
        this.motionValues.put("Falling Thrust II", 0.21);
        this.motionValues.put("Falling Thrust III ", 0.26);
    }

    public GreatSword(String weaponName, int rarity, int attack, int affinity, int elderseal, String sharpnessColor, String element){
        super(weaponName, rarity, attack, affinity, elderseal, sharpnessColor, element);
        this.damageType = "severing";
    }

    protected void trueDamage(){
        this.trueDamage = this.getAttack()/4.8;
    }

}
