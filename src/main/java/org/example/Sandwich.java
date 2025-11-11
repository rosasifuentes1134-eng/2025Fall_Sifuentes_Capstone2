package org.example;

import org.example.Enum.*;
import org.example.Price.BreadSizePrice;

import java.util.List;

public class Sandwich {
    private BreadSize breadSize;
    private BreadType breadType;
    private List<Meat> meats;
    private List<Cheese> cheeses;
    private List<Topping> regularToppings;
    private List<SideItem> sauces;
    private boolean toasted;

    public Sandwich(BreadSize breadSize, BreadType breadType, List<Meat> meats, List<Cheese> cheeses, List<Topping> regularToppings, List<SideItem> sauces, boolean toasted) {
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
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

    public List<SideItem> getSauces() {
        return sauces;
    }

    public void setSauces(List<SideItem> sauces) {
        this.sauces = sauces;
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
    public void addSauce(SideItem sauce) {

        sauces.add(sauce);
    }
    public double calculateTotal() {
        BreadSizePrice breadSizePrice = new BreadSizePrice();
        double total = breadSizePrice.getPrice();
        total += meats.size() * 1.00;// add $1 per meat
        total += cheeses.size() * 0.75; // add $0.75 per cheese
        total += regularToppings.size() * 0.0;
        return total;

    }

    }







