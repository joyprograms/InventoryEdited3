package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by meekinsworks on 8/11/16.
 */
public class InventoryItem {
    String name;
    String category;
    int numberInStock;


    public InventoryItem(String name, int numberInStock) {
        this.name = name;
        this.numberInStock = numberInStock;

    }


    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public static InventoryItem createItem(String name, String category, int numberInStock) throws Exception {

        if (category.equalsIgnoreCase("Button")) {
            return new Button(name, numberInStock);

        } else if (category.equalsIgnoreCase("Pen")) {
            return new Pen(name, numberInStock);

        } else if (category.equalsIgnoreCase("Mug")) {
            return new Mug(name, numberInStock);

        } else if (category.equalsIgnoreCase("Notebook")) {
            return new Notebook(name, numberInStock);

        } else if (category.equalsIgnoreCase("WallArt")) {
            return new WallArt(name, numberInStock);
        }



//        throw new Exception("Sorry, homes. That's not a valid category in your inventory system.");
        System.err.println("Sorry, homes. That's not a valid category in your inventory system.");
        return null;
    }
    //    Override toString()

    @Override
    public String toString() {
        return String.format("[%d] %s, which is a: %s", this.numberInStock, this.name, this.category);
    }
}
