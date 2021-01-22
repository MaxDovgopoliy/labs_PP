package com.Max.menu.setContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class AddLeafCommand implements ICommand {
    Storage storage;

    public AddLeafCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.addLeaf();
    }
}
