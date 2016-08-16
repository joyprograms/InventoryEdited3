package com.theironyard.charlotte;

/**
 * Created by meekinsworks on 8/11/16.
 */
public class Button extends InventoryItem {
    public Button(String name, int numberInStock) {
        super(name, numberInStock);

        this.category = "Button";
    }
}
