package droid;

public class Droid {
    protected String name;
    protected double health;
    protected double damage;
    protected double armor;
    protected double regeneration;
    protected double crit;
    protected double miss;

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getRegeneration() {
        return regeneration;
    }

    public void setRegeneration(double regeneration) {
        this.regeneration = regeneration;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
    

    public void strike(Droid Enemy) {
    }

    public void takeHit(double levelHit) {
    }
}
