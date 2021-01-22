package com.Max.menu.setContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

import java.util.Scanner;

public class RemoveFlowerCommand implements ICommand {
    Storage storage;

    public RemoveFlowerCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.print("\t\tEnter order of flower to remove: ");
        storage.removeFlower(in.nextInt());
    }
}