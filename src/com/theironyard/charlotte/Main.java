package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IndexOutOfBoundsException {

        ArrayList<InventoryItem> inventoryItems = new ArrayList<>();

        System.out.println("Hey! Welcome to the Muller inventory platform. Let's get started." + "We've got room for the following categories in your inventory list:" + "Pen, Mug, Button, Notebook, and WallArt. Great selections!");

        while (true) {

            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < inventoryItems.size(); i++) {
                System.out.println(i + " " + inventoryItems.get(i));
            }

            System.out.println("Please choose a number to execute the following actions:");

            System.out.println("[1] Add a new item to a category/enter name [2] Remove an item [3] Update the quantity of an item");


            int selection = Integer.valueOf(scanner.nextLine());


            if (selection == 1) {
                System.out.println("Ok. please enter the name");
                String name = scanner.nextLine();
                System.out.println("enter the quantity of your item");
                int numberInStock = Integer.valueOf(scanner.nextLine());
                System.out.println("What is the category?");
                String category = scanner.nextLine();
                System.out.println("Your item has been added! Whoohoo!");

                try {
                    inventoryItems.add(InventoryItem.createItem(name, category, numberInStock));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
//                InventoryItem item = InventoryItem.createItem(name, category, numberInStock);
//                inventoryItems.add(item);


            if (selection == 2) {
                System.out.println("You want to remove an item, correct? If so, please type the index that you want to remove'");
                int idx = Integer.valueOf(scanner.nextLine());
                inventoryItems.remove(idx);
                System.out.printf("Your item has been removed! Hope that wasn't an accident...If it was, we're sorry. Press the number after the integer that comes after 3 to make yourself feel better...");


            }
            if (selection == 3) {

                System.out.println("Alright, now what is the index of the item for which you want to update the quantity? ");
                int idx = Integer.valueOf(scanner.nextLine());


                System.out.println("And how many are there now?");
                int number = Integer.valueOf(scanner.nextLine());

                InventoryItem change = inventoryItems.get(idx);
                change.setNumberInStock(number);
                System.out.println("Cool. Numberage updated. :) Welcome to CoolVille. ");
            }
            if (selection == 4) {
                System.out.println("You have just been initiated into Awesome. Done via Easy Button. Welcome.");


            }
        }
    }

}




