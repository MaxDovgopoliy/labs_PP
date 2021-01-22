package com.Max;
import com.Max.Storage.Storage;
import com.Max.menu.Switch;
import com.Max.menu.SwitchSee;
import org.apache.log4j.Logger;

import java.io.*;

public class App {
    private final static Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        Storage storage = new Storage();

        try {
            FileInputStream f = new FileInputStream(new File(args[0]));
            ObjectInputStream o = new ObjectInputStream(f);

            storage = (Storage) o.readObject();

            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            log.error("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream.");
            log.error("Error initializing stream.");
        } catch (ClassNotFoundException e) {
            log.error("ClassNotFoundException");
            e.printStackTrace();
        }

        Switch s = new Switch(storage);
        System.out.println("--");
        do {
            System.out.println("________Menu________");
        } while (s.chooseCommand());


        try {
            FileOutputStream f = new FileOutputStream(new File(args[0]));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(storage);
            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            log.error("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            log.error("Error initializing stream");
        }
    }
}