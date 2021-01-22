package com.Max.menu.seeContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class SeeLeavesCommand implements ICommand {
    Storage storage;

    public SeeLeavesCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.showLeaves();
    }
}