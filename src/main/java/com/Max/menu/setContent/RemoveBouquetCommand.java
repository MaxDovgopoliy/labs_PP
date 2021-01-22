package com.Max.menu.setContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

import java.util.Scanner;

public class RemoveBouquetCommand implements ICommand {
    Storage storage;

    public RemoveBouquetCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.print("\t\tEnter order of bouquet to change: ");
        storage.removeBouquet(in.nextInt());
    }
}
