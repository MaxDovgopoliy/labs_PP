package com.Max.menu.setContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class CleanFlowers implements ICommand {
    Storage storage;

    public CleanFlowers(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.cleanFlowers();
    }
}