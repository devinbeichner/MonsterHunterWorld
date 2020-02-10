import java.util.HashMap;
import java.util.Map;

public class Hammer extends Blademaster {

    private String weaponType;

    Map<String, Double> motionValues = new HashMap<String, Double>();

    public Hammer(String weaponName, int rarity, int attack, int affinity, int elderseal, String sharpnessColor, String element){
        super(weaponName, rarity, attack, affinity, elderseal, sharpnessColor, element);
        this.weaponType = "impact";
    }

    protected void trueDamage(){
        this.trueDamage = this.getAttack()/5.2;
    }

}
