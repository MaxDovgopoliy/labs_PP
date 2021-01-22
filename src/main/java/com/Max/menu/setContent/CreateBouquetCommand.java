package com.Max.menu.setContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class CreateBouquetCommand implements ICommand {
    Storage storage;

    public CreateBouquetCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.createBouquet();
    }
}