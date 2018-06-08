package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {
    private Scanner input = new Scanner(System.in);
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
}
