package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    public void mainMenu() {

        try {
            System.out.println("Please choose an option. " +
                    "\n1. Manage People" +
                    "\n2. Manage Animals" +
                    "\n3. Manage Items");

            //Handles user input for navigation

            switch (input.nextInt()) {
                case 1:
                    //Manage people
                    managePeople();
                    break;
                case 2:
                    //Manage animals
                    manageAnimal();
                    break;
                case 3:
                    //Manage inventory
                    manageItems();
                    break;
                default:
                    //Handle wrong number
                    System.out.println("That is not a valid entry. Please enter a number between 1 and 3.");
                    //Restart method to allow user to try again
                    mainMenu();
                    break;
            }
        } catch(InputMismatchException ime) {
            //Handle if a use puts in something that is not an int
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1 and 3.");
            mainMenu();
        }

    }

    //Handles Inventory Options
    private void manageItems() {

    }

    //Handles Animal Options
    private void manageAnimal() {

    }

    //Handles People Options
    private void managePeople() {

        try {
            //Enter the code that you would like to run that MAY throw an exception
        } catch(InputMismatchException ime) {
            //What you want your program to do if this exception happens

        }

    }


}
