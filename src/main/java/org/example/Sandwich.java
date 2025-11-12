package org.example;

import org.example.Enum.*;
import org.example.Price.BreadSizePrice;
import org.example.Price.CheesePrice;
import org.example.Price.MeatPrice;
import org.example.Price.SideItem;

import java.util.List;

public class Sandwich {
    private BreadSize breadSize;
    private BreadType breadType;
    private List<Meat> meats;
    private List<Cheese> cheeses;
    private List<Topping> regularToppings;
    private List<SideItems> sideItems;
    private boolean toasted;

    public Sandwich(BreadSize breadSize, BreadType breadType, List<Meat> meats, List<Cheese> cheeses, List<Topping> regularToppings, List<SideItems> sideItems, boolean toasted) {
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.sideItems = sideItems;
        this.toasted = toasted;
    }

    public BreadSize getBreadSize() {
        return breadSize;
    }

    public void setBreadSize(BreadSize breadSize) {
        this.breadSize = breadSize;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public List<Meat> getMeats() {
        return meats;
    }

    public void setMeats(List<Meat> meats) {
        this.meats = meats;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public void setCheeses(List<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    public List<Topping> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(List<Topping> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public List<SideItems> getSideItems() {
        return sideItems;
    }

    public void setSauces(List<SideItems> sideItems) {
        this.sideItems = sideItems;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public void addMeat(Meat meat) {
        meats.add(meat);
    }
    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }


    public void addTopping(Topping topping) {
        regularToppings.add(topping);
    }
    public void addSideItem(SideItems sideItem) {

        sideItems.add(sideItem);
    }
    public double calculateTotal() {
        double total = 0;

        // Bread price
        BreadSizePrice breadSizePrice = new BreadSizePrice(breadSize);
        total += breadSizePrice.getPrice();

        // Meat prices
        for (Meat meat : meats) {
            MeatPrice meatPrice = new MeatPrice(meat);
            total += meatPrice.getPrice();
        }

        // Cheese prices
        for (Cheese cheese : cheeses) {
            CheesePrice cheesePrice = new CheesePrice(cheese);
            total += cheesePrice.getPrice();
        }

        // Toppings and sauces
       // for (Topping topping : regularToppings) {
        //    total += topping.getPrice();
       // }

        for (SideItems sideItems : sideItems) {
            SideItem sideItem = new SideItem(sideItems);
            total += sideItem.getPrice();
        }
        return total;

    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadSize=" + breadSize +
                ", breadType=" + breadType +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", regularToppings=" + regularToppings +
                ", sideItems=" + sideItems +
                ", toasted=" + toasted +
                '}';
    }
}







