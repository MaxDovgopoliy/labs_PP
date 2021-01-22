package com.Max.menu.setContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class AddFlowerCommand implements ICommand {
    Storage storage;

    public AddFlowerCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.addFlower();
    }
}