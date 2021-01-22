package com.Max.menu.setContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class AddDecorationCommand implements ICommand {
    Storage storage;

    public AddDecorationCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.addDecoration();
    }
}
