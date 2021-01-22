package com.Max.menu.seeContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class SortBouquetsCommand implements ICommand {
    Storage storage;

    public SortBouquetsCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.sortBouquets();
    }
}