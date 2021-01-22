package Arena;
import com.DovdopoliMax.color;
import droid.Droid;
import java.util.ArrayList;
import java.util.Random;


public class BattleArena {
    private ArrayList<Droid> firstTeam;
    private ArrayList<Droid> secondTeam;
    private Droid assaulter;
    private Droid target;
    private ArrayList<Droid> assaulterTeam;
    private ArrayList<Droid> targetTeam;
    private String winner;
    Random rand = new Random();
    color c=new color();


    public void fightTeamtoTeam(ArrayList<Droid> team1, ArrayList<Droid> team2) {

         firstTeam=team1;
         secondTeam=team2;
         int round = 1;

        do {
            do {
                printRoundInformation(round);
                setOpponents();

                assaulter.strike(target);


                System.out.println(c.ANSI_GREEN+ target.getName() + " was hit by " + assaulter.getName()+c.ANSI_RESET);
                round++;
            } while (target.isAlive());
            targetTeam.remove(target);
        }while(!targetTeam.isEmpty());
        System.out.println(c.ANSI_YELLOW+"\n"+winner+" won!");
    }

    private void printRoundInformation(int round) {
        System.out.println("_____________________");
        System.out.println(c.ANSI_BLUE+"Round " + round+c.ANSI_RESET);
    }

    private void setOpponents() {
        if (new Random().nextBoolean()) {
            assaulterTeam=firstTeam;
            assaulter = assaulterTeam.get(rand.nextInt(assaulterTeam.size()));
            targetTeam = secondTeam;
            target=targetTeam.get(rand.nextInt(targetTeam.size()));
            winner="Team 1";
        } else {
            assaulterTeam = secondTeam;
            assaulter=assaulterTeam.get(rand.nextInt(assaulterTeam.size())) ;
            targetTeam = firstTeam;
            target=targetTeam.get(rand.nextInt(targetTeam.size()));
            winner="Team 2";
        }
    }
}
