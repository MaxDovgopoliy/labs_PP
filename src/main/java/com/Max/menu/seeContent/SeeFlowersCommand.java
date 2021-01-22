package com.Max.menu.seeContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class SeeFlowersCommand implements ICommand {
    Storage storage;

    public SeeFlowersCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.showFlowers();
    }
}
