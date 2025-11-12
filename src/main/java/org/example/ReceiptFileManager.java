package org.example;

import org.example.Enum.*;
import org.example.Price.DrinkPrice;
import org.example.Price.SideItem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.example.Enum.Drink.*;
import static org.example.Enum.SideItems.*;

public class ReceiptFileManager {


        public static void saveOrder (Order order){
            //List<Order>order = new ArrayList<>();

            try{
            FileWriter fw = new FileWriter("src/main/resources/receipt.csv",true);
            BufferedWriter writer = new BufferedWriter(fw);


                // Write sandwiches
                for (Sandwich sandwich : order.getSandwiches()) {
                    writer.write(String.format("Sandwich | %s %s %s | - | %.2f%n",
                            sandwich.getBreadSize(),
                            sandwich.getBreadType(),
                            sandwich.getMeats().toString(),
                            sandwich.calculateTotal()));
                }

                // Write side items
                for (SideItem sideItem : order.getSideItems()) {
                    writer.write(String.format("Side | %s | - | %.2f%n",
                            sideItem.getSide(),
                            sideItem.getPrice()));
                }

                // Write drinks
                for (DrinkPrice drinkPrice : order.getDrinks()) {
                    //DrinkPrice drinkPrice = new DrinkPrice(drink);
                    writer.write(String.format("Drink | %s | %s | %.2f%n",
                            drinkPrice.toString(),
                            drinkPrice.getSize(),
                            drinkPrice.getPrice()));
                }

                writer.write(String.format("Total | - | - | %.2f%n%n", order.calculateTotal()));
                System.out.println("Order saved successfully!");
                System.out.println("Order saved successfully!");

            } catch (IOException e) {
                System.out.println("Failed to save order: " + e.getMessage());
            }
        }

        // Write a single sandwich to file
        private static void writeSandwich (BufferedWriter writer, Sandwich sandwich) throws IOException {
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


