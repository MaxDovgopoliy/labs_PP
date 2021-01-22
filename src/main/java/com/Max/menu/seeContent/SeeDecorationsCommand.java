package com.Max.menu.seeContent;

import com.Max.Storage.Storage;
import com.Max.menu.ICommand;

public class SeeDecorationsCommand implements ICommand {
    Storage storage;

    public SeeDecorationsCommand(Storage storage) {
        this.storage = storage;
    }

    public void execute() {
        storage.showDecorations();
    }
}