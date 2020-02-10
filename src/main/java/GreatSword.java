import java.util.HashMap;
import java.util.Map;

public class GreatSword extends Blademaster {

    private String weaponType;

    Map<String, Double> motionValues = new HashMap<String, Double>();

    public GreatSword(String weaponName, int rarity, int attack, int affinity, int elderseal, String sharpnessColor, String element){
        super(weaponName, rarity, attack, affinity, elderseal, sharpnessColor, element);
        this.weaponType = "severing";
    }

    protected void trueDamage(){
        this.trueDamage = this.getAttack()/4.8;
    }



    public String getWeaponType(){
        return weaponType;
    }
}
