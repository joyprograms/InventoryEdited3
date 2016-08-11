package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by meekinsworks on 8/11/16.
 */
public class InventoryItem {
    String name;
    String color;
    int numberInStock;
    String category;


    public InventoryItem(String name, int numberInStock, String color) {
        this.name = name;
        this.numberInStock = numberInStock;
        this.color = color;

    }

    public static InventoryItem createItem(String name, String color, String category, int numberInStock) throws Exception {

        if (category.equalsIgnoreCase("Pen")) {
            return new Pen(name, numberInStock, color);
        } else if (category.equalsIgnoreCase("Mug")) {
            return new Mug(name, numberInStock, color);
        } else if (category.equalsIgnoreCase("Button")) {
            return new Button(name, numberInStock, color);
        } else if (category.equalsIgnoreCase("Notebook")) {
            return new Button(name, numberInStock, color);
        } else if (category.equalsIgnoreCase("WallArt")) {
            return new Button(name, numberInStock, color);
        }

//        throw new Exception("Sorry, homes. That's not a valid category in your inventory system.");
        System.err.println("Sorry, homes. That's not a valid category in your inventory system.");
        return null;
    }


}
