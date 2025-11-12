package org.example;

import org.example.Enum.Drink;
import org.example.Price.DrinkPrice;
import org.example.Price.SideItem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    // These lists hold all the items in the order
    private List<Sandwich> sandwiches;
    private List<SideItem> sideItems;
    private List<Drink> drinks;

    // Constructor — this runs when you create a new order
    public Order() {
        sandwiches = new ArrayList<>();
        sideItems = new ArrayList<>();
        drinks = new ArrayList<>();

    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<DrinkPrice> getDrinks() {
        return new ArrayList<>();
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<SideItem> getSideItems() {
        return sideItems;
    }

    public void setSideItems(List<SideItem> sideItems) {
        this.sideItems = sideItems;
    }

    // Add items
    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addSide(SideItem side) {
        sideItems.add(side);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
    // Remove all items (for cancel)
    public void removeAll() {
        sandwiches.clear();
        sideItems.clear();
        drinks.clear();
    }
    // Display current items
    public void displayItems() {
        if (sandwiches.isEmpty() && sideItems.isEmpty() && drinks.isEmpty()) {
            System.out.println("Your order is empty.");
            return;
        }

        System.out.println("Items in your order:");

        for (Sandwich sandwich : sandwiches)
            System.out.println("- " + sandwich);

        for (SideItem side : sideItems)
            System.out.println(" " + side);

        for (Drink drink : drinks)
            System.out.println("- " + drink);

    }
    // Calculate total cost
    public double calculateTotal() {
        double total = 0.0;

        for (Sandwich sandwich : sandwiches) {
            total += sandwich.calculateTotal();
        }
        for (SideItem side : sideItems) {
            total += side.getPrice();
        }
        for (Drink drink : drinks) {
            DrinkPrice drinkPrice = new DrinkPrice(drink);
            total += drinkPrice.getPrice();
        }
        return total;

     }

    @Override
    public String toString() {
        return "Order{" +
                "sandwiches=" + sandwiches +
                ", sideItems=" + sideItems +
                ", drinks=" + drinks +
                '}';
    }
}






