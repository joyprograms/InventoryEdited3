package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<InventoryItem> item = new ArrayList<>();

            System.out.printf("Hey! Welcome to the BAGF inventory platform. Let's get started. We've got room for the following categories in your inventory list: Pen, Mug, Button, Notebook, and WallArt. Great selections! ");

        while (true) {

            System.out.println("Please choose a number to execute the following actions:");
            System.out.println("[1] Add a new item to a category/enter name [2] Remove an item [3] Update the quantity of an item");

            Scanner scanner = new Scanner(System.in);
            int selection = Integer.valueOf(scanner.nextLine());


            if (selection == 1) {
                System.out.println("Ok. please enter the name");
                scanner.nextLine();
                System.out.println("Your item has been added! Whoohoo!");


            }
            if (selection == 2) {
                System.out.println("You want to remove an item, correct? If so, please type the item name i.e. 'life mug.'");
                String unwanted = scanner.nextLine();
                item.remove(unwanted);
                System.out.printf("Your item has been removed! Hope that wasn't an accident...If it was, we're sorry. Press the number after the integer that comes after 3 to make yourself feel better...");


            }
            if (selection == 3) {

                System.out.println("Alright, now please type the quantity. How many do you have in stock?");
                int numberInStock = Integer.valueOf(scanner.nextLine());
                System.out.println("Cool. Numberage added. :) Welcome to CoolVille. ");


            }
            if (selection == 4) {
                System.out.println("You have just been initiated into Awesome. Done via Easy Button. Welcome.");

            }
        }
    }
}
