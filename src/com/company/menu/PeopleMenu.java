package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {
    private Scanner input = new Scanner(System.in);

    protected void managePeople() {
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
                    Menu menu = new Menu();
                    menu.mainMenu();
                    break;
                case 4:
                    //Handles exiting the program
                    System.out.println("Thank you for using the Zoo Program.");
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

    private void manageEmployee() {
        System.out.println("Would you like to " +
                "\n1. Add/Create Employees" +
                "\n2. View Employees" +
                "\n3. Remove Employees" +
                "\n4. Go Back" +
                "\n5. Exit Program");

        switch (input.nextInt()) {
            case 1:
                //Add or Create Employees
                break;
            case 2:
                //View Employees
                break;
            case 3:
                //Remove Employees
                break;
            case 4:
                //Go back to managePeople()/mainMenu()
                Menu menu = new Menu();
                menu.mainMenu();
                break;
            case 5:
                //Handles exiting the entire program
                System.out.println("Thank you for using the Zoo Program.");
                System.exit(1);
                break;
        }

    }

    private void manageVisitor() {

    }


}
