package org.example;

import org.example.Enum.*;
import org.example.Price.DrinkPrice;
import org.example.Price.SideItem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReceiptFileManager {
    public static void saveOrder(List<Sandwich>sandwiches, List<SideItem>sideItems, List<Drink>drinks){
        List<Order>orders = new ArrayList<>();
        try{
            FileWriter fw = new FileWriter("src/main/resources/receipt.csv",true);
            BufferedWriter writer = new BufferedWriter(fw);

            for (Sandwich sandwich : new ArrayList<>(sandwiches)) {
                writeSandwich(writer, sandwich);
            }


            // Write side items
            for (SideItem side : orders.) {
                writer.write("Side|" + side.getSide() + "|" + side.getPrice());
                writer.newLine();
            }

            // Write drinks
            for (Drink drink : order.getDrinks()) {
                DrinkPrice drinkPrice = new DrinkPrice(drink);
                writer.write("Drink|" + drink + "|" + drinkPrice.getPrice());
                writer.newLine();
            }

            System.out.println("Order saved successfully!");

        } catch (IOException e) {
            System.out.println("Failed to save order: " + e.getMessage());
        }
    }

    // Write a single sandwich to file
    private static void writeSandwich(BufferedWriter writer, Sandwich sandwich) throws IOException {
        StringBuilder line = new StringBuilder();

        line.append("Sandwich|");
        line.append(sandwich.getBreadSize()).append("|");
        line.append(sandwich.getBreadType()).append("|");

        // Meats
        List<Meat> meats = sandwich.getMeats();
        for (int i = 0; i < meats.size(); i++) {
            line.append(meats.get(i));
            if (i < meats.size() - 1) line.append(",");
        }
        line.append("|");

        // Cheeses
        List<Cheese> cheeses = sandwich.getCheeses();
        for (int i = 0; i < cheeses.size(); i++) {
            line.append(cheeses.get(i));
            if (i < cheeses.size() - 1) line.append(",");
        }
        line.append("|");

        // Toppings
        List<Topping> toppings = sandwich.getRegularToppings();
        for (int i = 0; i < toppings.size(); i++) {
            line.append(toppings.get(i));
            if (i < toppings.size() - 1) line.append(",");
        }
        line.append("|");

        // Sauces
        List<SideItems> sideItems = sandwich.getSideItems();
        for (int i = 0; i < sideItems.size(); i++) {
            line.append(sideItems.get(i));//?
            if (i < sideItems.size() - 1) line.append(",");
        }
        line.append("|");

        // Toasted
        line.append(sandwich.isToasted() ? "Toasted" : "Not Toasted");

        writer.write(line.toString());
        writer.newLine();


        // Optionally, write side items or drinks here if you want to save them separately

            System.out.println("Order saved successfully.");

        }

    }

