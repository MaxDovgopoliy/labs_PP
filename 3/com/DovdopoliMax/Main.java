package com.DovdopoliMax;
import Arena.BattleArena;
import droid.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static int amountOfMembers;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        color c=new color();

        ArrayList<Droid> team1 = new ArrayList<Droid>() ;
        ArrayList<Droid> team2 = new ArrayList<Droid>() ;
        System.out.println("1--Balansed team\n2--Сreate а team\n");
        if(in.nextInt()==1){
            Attacker a1=new Attacker();
            a1.setName("a1");
            Tank a2=new Tank();
            a2.setName("a2");
            Universal a3=new Universal();
            a3.setName("a3");
            team1.add(a1);
            team1.add(a2);
            team1.add(a3);

            Attacker b1=new Attacker();
            b1.setName("b1");
            Tank b2=new Tank();
            b2.setName("b2");
            Universal b3=new Universal();
            b3.setName("b3");
            team2.add(b1);
            team2.add(b2);
            team2.add(b3);
            PrintTeamMembers(team1);
            PrintTeamMembers(team2);
        }
        else {
            System.out.println("---input number of members in team:\n");
            amountOfMembers=in.nextInt();
            System.out.println("----- Team1----- ");
            CreateTeam(team1);
            PrintTeamMembers(team1);

            System.out.println("----- Team2----- ");
            CreateTeam(team2);
            PrintTeamMembers(team2);
        }


        BattleArena fight = new BattleArena();
        System.out.println("----------Fight team to team ------------");
        fight.fightTeamtoTeam(team1, team2);
    }

    private static void CreateTeam(ArrayList<Droid> team1) {
        Scanner in = new Scanner(System.in);

        int selectedDroidTeam;

        for (int i = 0; i < amountOfMembers; i++) {

            System.out.println("\nChoose fighter #" + (i+1) + " of Team: \n");
            System.out.println("Avaliable fighter: \n1---Attacker \n2---Tank \n3---Universal \n4---Vader \n");
            selectedDroidTeam = in.nextInt();
            while (selectedDroidTeam < 1 || selectedDroidTeam > 4) {
                System.out.println("wrong number choose again: ");
                selectedDroidTeam = in.nextInt();
            }
            System.out.println("Input fighter's name\n");

            switch (selectedDroidTeam) {

                case 1:
                    team1.add(new Attacker());
                    break;
                case 2:
                    team1.add(new Tank());
                    break;
                case 3:
                    team1.add(new Universal());
                    break;
                case 4:
                    team1.add(new Vader());
                    break;

            }

            Droid temp=new Droid();
            temp=team1.get(i);
            temp.setName(in.next());

        }
    }
    public static void PrintTeamMembers(ArrayList<Droid> team1){
        System.out.print(color.ANSI_CYAN+"team members: ");
        for(int i=0;i<team1.size();i++){
            Droid temp=team1.get(i);
            System.out.print(temp.getName()+"\t");
        }
        System.out.println("\n"+ color.ANSI_RESET);
    }
}
