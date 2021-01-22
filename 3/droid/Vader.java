package droid;
import com.DovdopoliMax.color;
import java.util.Random;

public class Vader extends Droid {
    color c=new color();
    public Vader() {
            health = 200;
            damage = 39;
            armor = 50;
            crit =  1.4;
            miss=5;
        }

        // get the hit
        public void strike(Droid Enemy) {
            Random rand = new Random();
            double currDamage;
            if(rand.nextInt(100)<=miss) {
                currDamage=0;
            }
            else{
                if (rand.nextInt(100) < 15) {
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
