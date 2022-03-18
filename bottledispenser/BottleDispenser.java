package com.example.bottledispenser;

import java.util.ArrayList;
import java.util.Locale;

public class BottleDispenser {
    private static BottleDispenser bd = new BottleDispenser();

    private int bottles;
    private float money;
    private int calculator = 1;
    private int pullonNumero = 0;
    private String palautus = null;
    // Initialize the array
    ArrayList<Bottle> bottleList = new ArrayList<Bottle>();


    private BottleDispenser() {
        bottles = 5;
        money = 0;

        bottleList.add(new Bottle());
        bottleList.add(new Bottle("Pepsi Max", 1.5, 2.2));
        bottleList.add(new Bottle("Coca-Cola Zero", 0.5, 2.0));
        bottleList.add(new Bottle("Coca-Cola Zero", 1.5, 2.5));
        bottleList.add(new Bottle("Fanta Zero", 0.5, 1.95));

    }

    public static BottleDispenser getInstance() {
        return bd;
    }

    public String addMoney() {
        money += 1;
        palautus = "Klink! Added more money!";
        return(palautus);
    }

    private void removeBottle(int valinta) {
        bottles -= 1;
        bottleList.remove(valinta);
    }

    public String buyBottle() {

        Bottle bottle = bottleList.get(pullonNumero);
        pullonNumero++;

        if ((money - bottle.getPrice()) <= 0) {
            palautus = "Add money first!";
        }

        if ((bottles > 0) && ((money - bottle.getPrice()) >= 0)) {
            removeBottle(pullonNumero);
            money -= bottle.getPrice();
            palautus = ("KACHUNK! " + bottle.getName() + " came out of the dispenser!");
        }
        return(palautus);
    }

    public String returnMoney() {
        palautus = String.format(Locale.FRENCH,"Klink klink. Money came out! You got %.2f€ back\n", money);
        money = 0;
        return(palautus);
    }

    public void listBottles() {
        for (Bottle b : bottleList) {
            System.out.println(calculator++ + ". Name: " + b.getName());
            System.out.println("	Size: " + b.getSize() + "	Price: " + b.getPrice());
        }
        calculator = 1;
    }
}
