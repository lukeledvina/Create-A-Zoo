package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    public void mainMenu() {

        try {
            System.out.println("Please choose an option. " +
                    "\n1. Manage People" +
                    "\n2. Manage Animals" +
                    "\n3. Manage Items" +
                    "\n4. Exit Program");

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
                case 4:
                    System.out.println("Thank you for using the Zoo Program.");
                    System.exit(0);
                    break;
                default:
                    //Handle wrong number
                    System.out.println("That is not a valid entry. Please enter a number between 1 and 4.");
                    //Restart method to allow user to try again
                    mainMenu();
                    break;
            }
        } catch (InputMismatchException ime) {
            //Handle if a use puts in something that is not an int
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1 and 4.");
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
            //Find out if the person is an employee or visitor
            System.out.println("Are you " +
                    "\n1. an Employee" +
                    "\n2. a Visitor" +
                    "\n3. Go Back" +
                    "\n4. Exit Program");


            switch (input.nextInt()) {
                case 1:
                    //Handle Employee
                    manageEmployee();
                    break;
                case 2:
                    //Handle Visitor
                    manageVisitor();
                    break;
                default:
                    //Handle incorrect input
                    managePeople();
                    break;
                case 3:
                    //Handles going back to the mainMenu();
                    mainMenu();
                    break;
                case 4:
                    //Handles exiting the program
                    System.out.println("That is not a valid entry. Please enter a number between 1 and 4.");
                    System.exit(1);
                    break;


            }
        } catch (InputMismatchException ime) {
            //Handle any input that is not an int
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1 and 4.");
            managePeople();
        }



        }

    private void manageVisitor() {

    }

    private void manageEmployee() {

    }

}





