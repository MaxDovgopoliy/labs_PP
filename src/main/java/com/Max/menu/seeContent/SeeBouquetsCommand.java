package com.Max.menu.seeContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class SeeBouquetsCommand implements ICommand {
    Storage storage;

    public SeeBouquetsCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.showBouquets();
    }
}
