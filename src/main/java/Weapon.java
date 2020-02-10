public abstract class Weapon {
    private String weaponName;
    private int rarity;
    private int attack;
    private double affinity;
    private double elderseal;
    protected double trueDamage;

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

    public int getRarity() {
        return rarity;
    }

    public int getAttack() {
        return attack;
    }

    public double getAffinity() {
        return affinity;
    }

    public double getElderseal() {
        return elderseal;
    }

    public double getTrueDamage() {
        return trueDamage;
    }
}
