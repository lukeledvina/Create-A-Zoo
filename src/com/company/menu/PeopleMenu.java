package com.company.menu;

import com.company.people.Employee;

import java.util.EmptyStackException;
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

    private void manageVisitor() {
        System.out.println("Would you like to " +
                "\nWhat would you like to do:" +
                "\n1. Add/Create Visitor" +
                "\n2. View Visitor" +
                "\n3. Remove Visitor" +
                "\n4. Edit An Visitor" +
                "\n5. Go Back" +
                "\n6. Exit Program");

        try {
            switch (input.nextInt()) {
                case 1:
                    //Add or Create Employees
                    createPerson(2);
                    break;
                case 2:
                    //View Employees
                    break;
                case 3:
                    //Remove Employees
                    break;
                case 4:
                    //Edit Employees
                    break;
                case 5:
                    //Go back to managePeople()/mainMenu()
                    manageVisitor();
                    break;
                case 6:
                    //Handles exiting the entire program
                    System.out.println("Thank you for using the Zoo Program.");
                    System.exit(1);
                    break;
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1 and 6.");
            manageVisitor();
        }

    }

    private void manageEmployee() {

        System.out.println("Would you like to " +
                "\nWhat would you like to do:" +
                "\n1. Add/Create Employees" +
                "\n2. View Employees" +
                "\n3. Remove Employees" +
                "\n4. Edit An Employee" +
                "\n5. Go Back" +
                "\n6. Exit Program");

        try {
            switch (input.nextInt()) {
                case 1:
                    //Add or Create Employees
                    createPerson(1);
                    break;
                case 2:
                    //View Employees
                    break;
                case 3:
                    //Remove Employees
                    break;
                case 4:
                    //Edit Employees
                    break;
                case 5:
                    //Go back to managePeople()/mainMenu()
                    manageEmployee();
                    break;
                case 6:
                    //Handles exiting the entire program
                    System.out.println("Thank you for using the Zoo Program.");
                    System.exit(1);
                    break;
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1 and 6.");
            manageEmployee();
        }


    }


    private void createPerson(int location) {


        //If location == 1, new employee, if location == 2, new Visitor
        if (location == 1) {

            System.out.println("What is the employee's age?");
            int employeeAge = input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's name?");
            String employeeName = input.nextLine();
            System.out.println("What gender is the employee?");
            char employeeGender = input.nextLine().charAt(0);
            System.out.println("What is the employee's race?");
            String employeeRace = input.nextLine();
            System.out.println("What is the employee's Employee Number?");
            int employeeNumber = input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's job title?");
            String employeeJobTitle = input.nextLine();
            System.out.println("What date was the employee hired?");
            String employeeHireDate = input.nextLine();


            Employee newEmployee = new Employee(employeeAge, employeeName, employeeGender, employeeRace, employeeNumber, employeeJobTitle, employeeHireDate);

            //TODO Add employee to Employee list

        } else if (location == 2) {


        }
    }
}




