package org.example;

import org.example.Enum.Drink;
import org.example.Price.DrinkPrice;
import org.example.Price.SideItemPrice;

import java.util.ArrayList;
import java.util.List;

public class Order {

        private List<Object> items;  // can hold Sandwich, Drink, Chips, etc.
        private double totalPrice;

        public Order(List<Object> items, double totalPrice) {
            this.items = items;
            this.totalPrice = totalPrice;
        }
        public Order() {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        }

        public void setItems(List<Object> items) {
            this.items = items;
        }

        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }

        //  Add an item to the order
        public void addItem(Object item) {
            items.add(item);
        }

        // Remove all items (for cancel)
        public void remove() {
            items.remove(new Object());
            totalPrice = 0.0;
        }

        // Display current items
        public void displayItems() {
            if (items.isEmpty()) {
                System.out.println("Your order is empty.");
                return;
            }

            System.out.println("Items in your order:");
            for (Object item : items) {
                System.out.println("- " + item.toString());
            }
        }

        //  Calculate total cost of order
        public double calculateTotal() {
            double total = 0.0;
            for (Object item : items) {
                if (item instanceof Sandwich sandwich) {
                    total += sandwich.calculateTotal();
                } else if (item instanceof DrinkPrice drinkPrice) {
                    total += drinkPrice.getPrice();
                } else if (item instanceof SideItemPrice sideItemPrice) {
                    total += sideItemPrice.getPrice();
                }
            }
            this.totalPrice = total;
            return total;
        }


        public double getTotalPrice() {
            return totalPrice;
        }

        public List<Object> getItems() {
            return items;
        }
    }


