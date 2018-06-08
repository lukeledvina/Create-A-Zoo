package com.company;

import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    public void mainMenu() {

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
                //Restart method to allow user to try again
                break;
        }


    }

    private void manageItems() {
    }

    private void manageAnimal() {
    }

    private void managePeople() {
        
    }


}
