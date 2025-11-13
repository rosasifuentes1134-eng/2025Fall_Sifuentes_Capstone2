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

            try{
            FileWriter fw = new FileWriter("src/main/resources/receipt.csv",true);
            BufferedWriter writer = new BufferedWriter(fw);

                // Write sandwiches
                for (Sandwich sandwich : order.getSandwiches()) {
                    writer.write(String.format("Sandwich | %s %s  | Meats: %s | Cheeses: %s | Toppings: %s | %.2f%n",
                            sandwich.getBreadSize(),
                            sandwich.getBreadType(),
                            sandwich.getMeats().toString(),
                            sandwich.getCheeses().toString(),
                            sandwich.getRegularToppings().toString(),
                            sandwich.calculateTotal()));
                }

                // Write side items
                for (SideItem sideItem : order.getSideItems()) {
                    writer.write(String.format("Side | %s | - | %.2f%n",
                            sideItem.getSide(),
                            sideItem.getPrice()));
                }

                // Write drinks
                for (Drink drink : order.getDrinks()) {
                    DrinkPrice drinkPrice = new DrinkPrice(drink);
                    writer.write(String.format("Drink | %s | - | %.2f%n",
                            drink,
                            drinkPrice.getPrice()));
                }
                writer.write(String.format("Total: $%.2f%n%n", order.calculateTotal()));
                System.out.println("Order saved successfully!");
                System.out.println("Order saved successfully!");
                writer.close();
                fw.close();

            } catch (IOException e) {
                System.out.println("Failed to save order: " + e.getMessage());
            }
        }

        // Write a single sandwich to file

    }


