package droid;
import com.DovdopoliMax.color;
import java.util.Random;

public class Tank extends Droid {
    color c=new color();
    public Tank() {
        health = 100;
        damage = 20;
        armor = 55;
        regeneration = 2;
        miss=8;
    }


    public void strike(Droid Enemy) {
        Random rand = new Random();
        if(rand.nextInt(100)<=miss) {
            Enemy.takeHit(0);
        }
        else{
            Enemy.takeHit(damage);
        }

        if(health<=97){
        health +=regeneration;
        }
    }

    public void takeHit(double levelHit) {
        health = health - levelHit *armor/100;
        if(health>0) {
            String healthFormatted = String.format("%.2f", health);
            System.out.println("Health point of " + this.name + "\tis\t" + healthFormatted);
        }
        else{
            System.out.println(c.ANSI_RED+"Health point of " + this.name + "\tis\t0\t (is dead)"+ c.ANSI_RESET);
        }
    }
}
