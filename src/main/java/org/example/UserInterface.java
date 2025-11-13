package org.example;

import org.example.Enum.*;
import org.example.Price.SideItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    private Order order;

    //public void displayOrder(){}

    private void init() {

    }

    public void display() {
        init();
        boolean isDisplayRunning = true;


        String userInput = null;
        while (isDisplayRunning) {
            System.out.println("\n" + "=".repeat(50));
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
        this.order = new Order();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n"+ "=".repeat(50));
            System.out.println("""
                    1) Add Sandwich
                    2) Add Drink
                    3) Add Chips
                    4) Checkout
                    5) Cancel Order
                    """);
            String userInput = scanner.nextLine();

            if (userInput.isBlank()) {
                System.out.println("Please try again.");
                continue;
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
                    processCheckoutRequest(order);
                    isRunning = false;
                    break;
                case "5":
                    processCancelOrderRequest(order);
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public void processAddSandwichRequest() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Choose sandwich size (FOUR_INCH / EIGHT_INCH / TWELVE_INCH):");
        String size = scanner.nextLine();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Choose bread type (WHITE / WHEAT / RYE / WRAP):");
        System.out.println("Sandwich Prices");
        System.out.printf("%-10s %8s %8s %8s%n", "Type", "4\"", "8\"", "12\"");
        System.out.printf("%-10s %8.2f %8.2f %8.2f%n", "Bread", 5.50, 7.00, 8.50);

        String bread = scanner.nextLine();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Would you like your bread toasted? (yes/no)");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Choose meat type (STEAK / HAM / SALAMI / ROAST BEEF / CHICKEN / BACON):");
        System.out.println("Meat Prices");
        System.out.printf("%-12s %8s %8s %8s%n", "Type", "4\"", "8\"", "12\"");
        System.out.printf("%-10s %8.2f %8.2f %8.2f%n", "Meat", 1.00, 2.00, 3.00);

        String meat = scanner.nextLine();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Add extra meat? (yes/no)");
        System.out.println("Choose meat type (STEAK / HAM / SALAMI / ROAST BEEF / CHICKEN / BACON):");
        System.out.println("Extra meat price");
        System.out.printf("%-12s %8s %8s %8s%n", "Extra", "4\"", "8\"", "12\"");
        System.out.printf("%-10s %8.2f %8.2f %8.2f%n", "Extra Meat", 0.50, 1.00, 1.50);
        boolean extraMeat = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Choose cheese type (AMERICAN / PROVOLONE / CHEDDAR / SWISS):");
        System.out.println("Cheese price");
        System.out.printf("%-12s %8s %8s %8s%n", "Type", "4\"", "8\"", "12\"");
        System.out.printf("%-10s %8.2f %8.2f %8.2f%n", "Cheese", 0.75, 1.50, 2.50);
        String cheese = scanner.nextLine();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Add extra cheese? (yes/no)");
        System.out.println("Choose cheese type (AMERICAN / PROVOLONE / CHEDDAR / SWISS):");
        System.out.println("Extra cheese price");
        System.out.printf("%-12s %8s %8s %8s%n", "Extra", "4\"", "8\"", "12\"");
        System.out.printf("%-10s %8.2f %8.2f %8.2f%n", "Extra Cheese", 0.50, 1.00, 1.50);
        boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Add toppings:");
        System.out.println("Choose topping (LETTUCE / PEPPERS / ONIONS / TOMATOES / JALAPENOS / CUCUMBERS / PICKLES / GUACAMOLE / MUSHROOMS)");


        String toppings = scanner.nextLine();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Add sauces:");
        System.out.println("Choose sauce (MAYO / MUSTARD / KETCHUP / RANCH / THOUSAND ISLANDS / VINAIGRETTE)");
        String sauces = scanner.nextLine();

        try {
            // Create empty lists
            List<Meat> meatList = new ArrayList<>();
            List<Cheese> cheeseList = new ArrayList<>();
            List<Topping> toppingList = new ArrayList<>();

            // Add meat to list
            Meat meatType = Meat.valueOf(meat.toUpperCase().replace(" ", "_"));
            meatList.add(meatType);
            if (extraMeat) {
                meatList.add(meatType); // Add same meat again for extra
            }

            // Add cheese to list
            Cheese cheeseType = Cheese.valueOf(cheese.toUpperCase());
            cheeseList.add(cheeseType);
            if (extraCheese) {
                cheeseList.add(cheeseType); // Add same cheese again for extra
            }

            // Add toppings to list if entered
            if (!toppings.isBlank()) {
                Topping topping = Topping.valueOf(toppings.toUpperCase());
                toppingList.add(topping);
            }

            // Create sandwich with all the lists
            Sandwich sandwich = new Sandwich(
                    BreadSize.valueOf(size.toUpperCase()),
                    BreadType.valueOf(bread.toUpperCase()),
                    meatList,
                    cheeseList,
                    toppingList,
                    toasted
            );

            // ADD TO ORDER
            order.addSandwich(sandwich);

            System.out.println("Sandwich added successfully!");


        } catch (Exception e) {
            System.out.println("Invalid input. sandwich not added:" + e.getMessage());
        }
    }
        public void processAddDrinkRequest () {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("Choose drink size(SMALL / MEDIUM / LARGE");
            System.out.println("drink price");
            System.out.printf("%-10s %8.2f %8.2f %8.2f%n", "Drink", 2.00, 2.50, 3.00);

            String size = scanner.nextLine();

            try {
                Drink drink = Drink.valueOf(size.toUpperCase());
                order.addDrink(drink);
                System.out.println("Drink added successfully!");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid drink size: " + e.getMessage());
            }

        }

        public void processAddChipsRequest () {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("Add chips(yes/no)");
            boolean answer = scanner.nextLine().equalsIgnoreCase("yes");

            try {
                SideItem chips = new SideItem(SideItems.CHIPS);
                order.addSideItem(chips);
                System.out.println("Chips added successfully!");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid chips type: " + e.getMessage());
            }

        }

        public void processCheckoutRequest (Order currentOrder){
            System.out.println("\n" + "=".repeat(50));
            System.out.println("\nProcessing checkout...");


            currentOrder.displayItems();
            double total = currentOrder.calculateTotal();
            System.out.printf("Total: $%.2f%n", total);

            // Ask for confirmation
            System.out.println("Would you like to:");
            System.out.println("1) Confirm ");
            System.out.println("2) Cancel ");

            String choice = scanner.nextLine().trim();  // Add .trim() here

            if (choice.equals("1")) {
                // Confirm - save receipt and complete checkout
                currentOrder.printReceipt();
                ReceiptFileManager.saveOrder(currentOrder);
                System.out.println("Checkout complete. Thank you for your order!\n");
            } else if (choice.equals("2")) {
                // Cancel - delete order without saving
                currentOrder.removeAll();
                System.out.println("Order cancelled. Returning to home screen.\n");
            } else {
                System.out.println("Invalid choice. Returning to order menu.\n");
            }

            //Pass the order and indicate it’s not cancelled
            currentOrder.printReceipt();
            ReceiptFileManager.saveOrder(currentOrder);


            currentOrder.removeAll();
            System.out.println("Checkout complete. Thank you for your order!\n");
        }

        public void processCancelOrderRequest (Order currentOrder){
            System.out.println("\n" + "=".repeat(50));
            System.out.println("\nCancelling order...");

            if (currentOrder.getSandwiches().isEmpty() &&
                    currentOrder.getSideItems().isEmpty() &&
                    currentOrder.getDrinks().isEmpty()) {
                System.out.println("There’s nothing to cancel — your order is empty.");
                return;
            }
            currentOrder.removeAll();
            System.out.println("Your order has been cancelled.\n");
        }

    }



