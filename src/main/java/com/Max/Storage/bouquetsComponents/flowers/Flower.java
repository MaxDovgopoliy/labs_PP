package com.Max.Storage.bouquetsComponents.flowers;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class Flower implements Serializable {
    protected String name;
    protected int buttonSize;
    protected LocalDate timeOfLife;
    protected int length;
    protected int verdure;
    protected String color;
    protected double price;

    public Flower() {
        timeOfLife = LocalDate.now();
    }

    public boolean checkVerdure() {
        LocalDate temp = timeOfLife.plusDays(verdure);
        return LocalDate.now().isAfter(temp);
    }

    public void changeFlower() {
        System.out.print("\t\t1 - change button size\n"
                + "\t\t2 - change length\n"
                + "\t\t3 - change color\n\t\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                chooseButtonSize();
                break;
            case 2:
                chooseLength();
                break;
            case 3:
                chooseColor();
                break;
            default:
                return;
        }
        setPrice();
    }

    protected abstract void chooseColor();

    protected abstract void chooseButtonSize();

    protected abstract void chooseLength();

    protected abstract void setPrice();

    @Override
    public String toString() {
        return "Flower " +
                color + ' ' + name +
                " with length " + length +
                " with button size " + buttonSize +
                " price - " + price;
    }

    public double getPrice() {
        return price;
    }

    public int getButtonSize() {
        return buttonSize;
    }

    public int getLength() {
        return length;
    }
}