package com.theironyard.charlotte;

/**
 * Created by meekinsworks on 8/11/16.
 */
public class Pen extends InventoryItem {

    public Pen (String name, int numberInStock) {
        super(name, numberInStock);

        category = "Pen";
    }
}
