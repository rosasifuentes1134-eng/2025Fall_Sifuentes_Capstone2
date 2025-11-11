package org.example;

import java.util.Scanner;


public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    private Sandwich sandwich;

    public UserInterface() {
        init();
    }

    private void init() {
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
                case "2":
                    isDisplayRunning = false;
                    break;
                default:
                    System.out.println("Please try again");
            }
        }

    }

    public void processGetMakeAnOrderRequest() {
        //Order order = new Order();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("""
                    1) Add Sandwich
                    2) Add Drink
                    3) Add Chips
                    4) Checkout
                    0) Cancel Order
                    """);
            String userInput = scanner.nextLine();

            if (userInput.isBlank()) {
                System.out.println("Please try again.");
                return;
            }

            switch (userInput) {
                case "1":
                    processAddSandwichRequest();
                    break;
                case "2":
                    processAddDrinkRequest();
                    break;
                case "3":
                    processAddChipsRequest();
                    break;
                case "4":
                    processCheckoutRequest();
                    break;
                case "5":
                    processCancelOrderRequest();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public void processAddSandwichRequest() {

        System.out.println("Choose sandwich size (FOUR_INCH / EIGHT_INCH / TWELVE_INCH):");
        String size = scanner.nextLine();

        System.out.println("Choose bread type (WHITE / WHEAT / RYE / WRAP):");
        System.out.println("Sandwich Prices");
        System.out.printf("%-10s %8s %8s %8s%n", "Type", "4\"", "8\"", "12\"");
        System.out.printf("%-10s %8.2f %8.2f %8.2f%n", "Bread", 5.50, 7.00, 8.50);

        String bread = scanner.nextLine();

        System.out.println("Choose meat type (STEAK / HAM / SALAMI / ROAST BEEF / CHICKEN / BACON):");
        System.out.println("Meat Prices");
        System.out.printf("%-12s %8s %8s %8s%n", "Meat", "4\"", "8\"", "12\"");

        String meat = scanner.nextLine();

        System.out.println("Add cheese? (yes/no)");
        System.out.println("Choose cheese type:");

        String toppings = scanner.nextLine();
        System.out.println("Add toppings:");

        String sauces = scanner.nextLine();
        System.out.println("Add sauces:");

        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        //Sandwich sandwich = new Sandwich();
        //order.addItem(sandwich);

        System.out.println("Added " + size + " " + meat + " sandwich to your order.");
    }
    public void processAddDrinkRequest(){
        String drink = scanner.nextLine();

        System.out.println("Choose drink size:");
        System.out.println("""
                SMALL
                MEDIUM
                LARGE
                """);

    }
    public void processAddChipsRequest(){
        boolean chips = scanner.nextLine().equalsIgnoreCase("yes");

    }
    public void processCheckoutRequest(){

    }
    public void processCancelOrderRequest(){

    }



    }

