package org.example;

import java.util.Scanner;


public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    private Sandwich sandwich;

    public UserInterface(){
        init();
    }
    private void init(){
      //  FileManager fileManager = FileManager();
      //  this.sandwich = fileManager.getSandwich;
    }
    public void display() {
        boolean isDisplayRunning = true;


        String userInput = null;
        while (isDisplayRunning) {

            System.out.println("""
                    Welcome to my Deli Shop
                    Please choose an option:
                    1) Make an Order
                    2) Exit
                    """);
            userInput = scanner.nextLine();

            if (userInput.isBlank()) {
                System.out.println("Please try again.");
                return;
            }

        switch (userInput) {
            case "1":
                processGetMakeAnOrderRequest();
                break;
            case"2":
                isDisplayRunning = false;
                break;
            default:
                System.out.println("Please try again");
        }
    }

   }
    public void processGetMakeAnOrderRequest(){
        boolean isRunning = true;

        while (isRunning){
            System.out.println("""
                    1) Add Sandwich
                    2) Add Drink
                    3) Add Chips
                    4) Checkout
                    0) Cancel Order
                    """);
        }
    }
}
