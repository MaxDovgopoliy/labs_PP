package com.Max.menu;

import com.Max.Storage.Storage;
import com.Max.menu.seeContent.*;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class SwitchSee {
    private final Logger log = Logger.getLogger(SwitchSee.class);
    private final ICommand seeBouquetsCommand;
    private final ICommand seeDecorationsCommand;
    private final ICommand seeFlowersCommand;
    private final ICommand seeLeavesCommand;
    private final ICommand sortBouquetsCommand;
    private final ICommand sortFlowersCommand;

    public SwitchSee(Storage storage) {
        this.seeBouquetsCommand = new SeeBouquetsCommand(storage);
        this.seeDecorationsCommand = new SeeDecorationsCommand(storage);
        this.seeFlowersCommand = new SeeFlowersCommand(storage);
        this.seeLeavesCommand = new SeeLeavesCommand(storage);
        this.sortBouquetsCommand = new SortBouquetsCommand(storage);
        this.sortFlowersCommand = new SortFlowersCommand(storage);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - see list of bouquets\n"
                + "\t2 - see list of decorations\n"
                + "\t3 - see list of flowers\n"
                + "\t4 - see list of leaves\n"
                + "\t5 - sort list of bouquets\n"
                + "\t6 - sort list of flowers\n"
                + "\t7 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                seeBouquetsCommand();
                log.info("see list of bouquets");
                break;
            case 2:
                seeDecorationsCommand();
                log.info("see list of decorations");
                break;
            case 3:
                seeFlowersCommand();
                log.info("see list of flowers");
                break;
            case 4:
                seeLeavesCommand();
                log.info("see list of leaves");
                break;
            case 5:
                sortBouquetsCommand();
                log.info("sort list of bouquets");
                seeBouquetsCommand();
                break;
            case 6:
                sortFlowersCommand();
                log.info("sort list of flowers");
                seeFlowersCommand();
                break;
            default:
                return false;
        }
        return true;
    }

    private void seeBouquetsCommand() {
        seeBouquetsCommand.execute();
    }

    private void seeDecorationsCommand() {
        seeDecorationsCommand.execute();
    }

    private void seeFlowersCommand() {
        seeFlowersCommand.execute();
    }

    private void seeLeavesCommand() {
        seeLeavesCommand.execute();
    }

    private void sortBouquetsCommand() {
        sortBouquetsCommand.execute();
    }

    private void sortFlowersCommand() {
        sortFlowersCommand.execute();
    }

}