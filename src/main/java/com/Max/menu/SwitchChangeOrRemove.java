package com.Max.menu;

import com.Max.Storage.Storage;
import com.Max.menu.seeContent.SeeBouquetsCommand;
import com.Max.menu.seeContent.SeeFlowersCommand;
import com.Max.menu.setContent.ChangeBouquetCommand;
import com.Max.menu.setContent.ChangeFlowerCommand;
import com.Max.menu.setContent.RemoveBouquetCommand;
import com.Max.menu.setContent.RemoveFlowerCommand;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class SwitchChangeOrRemove {
    private final Logger log = Logger.getLogger(SwitchChangeOrRemove.class);
    private final ICommand changeBouquetCommand;
    private final ICommand changeFlowerCommand;
    private final ICommand seeBouquetsCommand;
    private final ICommand seeFlowersCommand;
    private final ICommand removeFlowerCommand;
    private final ICommand removeBouquetCommand;

    public SwitchChangeOrRemove(Storage storage) {

        this.changeBouquetCommand = new ChangeBouquetCommand(storage);
        this.changeFlowerCommand = new ChangeFlowerCommand(storage);
        this.seeBouquetsCommand = new SeeBouquetsCommand(storage);
        this.seeFlowersCommand = new SeeFlowersCommand(storage);
        this.removeFlowerCommand = new RemoveFlowerCommand(storage);
        this.removeBouquetCommand = new RemoveBouquetCommand(storage);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - change bouquet\n"
                + "\t2 - change flower\n"
                + "\t3 - remove bouquet\n"
                + "\t4 - remove flower\n"
                + "\t5 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                seeBouquetsCommand();
                log.info("change bouquet");
                changeBouquetCommand();
                break;
            case 2:
                seeFlowersCommand();
                log.info("change flower");
                changeFlowerCommand();
                break;
            case 3:
                seeBouquetsCommand();
                log.info("remove bouquet");
                removeBouquetCommand();
                break;
            case 4:
                seeFlowersCommand();
                log.info("remove flower");
                removeFlowerCommand();
                break;
            default:
                return false;
        }
        return true;
    }

    private void removeFlowerCommand() {
        removeFlowerCommand.execute();
    }

    private void removeBouquetCommand() {
        removeBouquetCommand.execute();
    }

    private void changeBouquetCommand() {
        changeBouquetCommand.execute();
    }

    private void changeFlowerCommand() {
        changeFlowerCommand.execute();
    }

    private void seeBouquetsCommand() {
        seeBouquetsCommand.execute();
    }

    private void seeFlowersCommand() {
        seeFlowersCommand.execute();
    }
}
