package WeaponInfo;

public abstract class Blademaster extends Weapon {
    private String sharpnessColor;
    private double physicalSharpnessMod;
    private double elementalSharpnessMod;
    private String element;
    private String impactOrSevering;

    public Blademaster(String weaponName, int rarity, int attack, int affinity, int elderseal, String sharpnessColor, String element){
        super(weaponName, rarity, attack, affinity, elderseal);
        this.sharpnessColor = sharpnessColor.toLowerCase();
        this.element = element.toLowerCase();
    }

    protected void setSharpness(String sharpnessColor) {
        if (sharpnessColor.equals("white")) {
            this.physicalSharpnessMod = 1.32;
            this.elementalSharpnessMod = 1.125;
        } else if (sharpnessColor.equals("blue")) {
            this.physicalSharpnessMod = 1.2;
            this.elementalSharpnessMod = 1.0625;
        } else if (sharpnessColor.equals("green")) {
            this.physicalSharpnessMod = 1.05;
            this.elementalSharpnessMod = 1.0;
        } else if (sharpnessColor.equals("yellow")) {
            this.physicalSharpnessMod = 1.0;
            this.elementalSharpnessMod = 0.75;
        } else if (sharpnessColor.equals("orange")) {
            this.physicalSharpnessMod = 0.75;
            this.elementalSharpnessMod = 0.5;
        } else {
            this.physicalSharpnessMod = 0.5;
            this.elementalSharpnessMod = 0.25;
        }
    }


    public String getSharpnessColor() {
        return sharpnessColor;
    }

    public double getPhysicalSharpnessMod() {
        return physicalSharpnessMod;
    }

    public double getElementalSharpnessMod() {
        return elementalSharpnessMod;
    }

    public String getElement() {
        return element;
    }

    public String getImpactOrSevering(){
        return impactOrSevering;
    }
}