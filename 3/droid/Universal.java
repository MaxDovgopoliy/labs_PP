package droid;
import com.DovdopoliMax.color;

public class Universal extends Droid {
    color c=new color();
    public Universal() {
            health = 100;
            damage = 25;
            armor = 50;
            regeneration = 1;
        }


        public void strike(Droid Enemy) {
            Enemy.takeHit(damage);
            health +=regeneration;
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

