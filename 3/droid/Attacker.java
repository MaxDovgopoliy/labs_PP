package droid;
import com.DovdopoliMax.color;
import java.util.Random;

public class Attacker extends Droid {
    color c=new color();
    public Attacker() {
        health = 100;
        damage = 35;
        armor = 55;
        regeneration = 0;
        crit =  1.4;
        miss=6;
    }

    // get the hit
    public void strike(Droid Enemy) {
        Random rand = new Random();
        double currDamage;
        if(rand.nextInt(100)<=miss) {
            currDamage=0;
        }
        else{
            if (rand.nextInt(100) < 5) {
                currDamage = damage * crit;
            } else {
                currDamage = damage;
            }
        }


        Enemy.takeHit(currDamage);
    }

    public void takeHit(double levelHit) {
        health = health - levelHit * armor/100;
        if(health>0) {
            String healthFormatted = String.format("%.2f", health);
            System.out.println("Health point of " + this.name + "\tis\t" + healthFormatted);
        }
        else{
            System.out.println(c.ANSI_RED+"Health point of " + this.name + "\tis\t0\t (is dead)"+ c.ANSI_RESET);
        }
    }
}