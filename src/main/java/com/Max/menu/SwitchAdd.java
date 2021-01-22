package com.Max.menu;

import com.Max.Storage.Storage;
import com.Max.menu.setContent.AddDecorationCommand;
import com.Max.menu.setContent.AddFlowerCommand;
import com.Max.menu.setContent.AddLeafCommand;
import com.Max.menu.setContent.CreateBouquetCommand;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class SwitchAdd {
    private final Logger log = Logger.getLogger(SwitchAdd.class);
    private final ICommand addDecorationCommand;
    private final ICommand addFlowerCommand;
    private final ICommand addLeafCommand;
    private final ICommand createBouquetCommand;

    public SwitchAdd(Storage storage) {
        this.addDecorationCommand = new AddDecorationCommand(storage);
        this.addFlowerCommand = new AddFlowerCommand(storage);
        this.addLeafCommand = new AddLeafCommand(storage);
        this.createBouquetCommand = new CreateBouquetCommand(storage);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - add decoration\n"
                + "\t2 - add flower\n"
                + "\t3 - add leaf\n"
                + "\t4 - add bouquet\n"
                + "\t5 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                addDecorationCommand();
                log.info("add decoration");
                break;
            case 2:
                addFlowerCommand();
                log.info("add flower");
                break;
            case 3:
                addLeafCommand();
                log.info("add leaf");
                break;
            case 4:
                createBouquetCommand();
                log.info("add bouquet");
                break;
            default:
                return false;
        }
        return true;
    }

    private void addDecorationCommand() {
        addDecorationCommand.execute();
    }

    private void addFlowerCommand() {
        addFlowerCommand.execute();
    }

    private void addLeafCommand() {
        addLeafCommand.execute();
    }

    private void createBouquetCommand() {
        createBouquetCommand.execute();
    }

}