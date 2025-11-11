package org.example;

import org.example.Enum.BreadType;
import org.example.Enum.BreadSize;
import org.example.Price.BreadSizePrice;

import java.util.List;

public class Sandwich {
    private BreadSize breadSize;
    private BreadType breadType;
    private List<String> meats;
    private List<String> cheeses;
    private List<String> regularToppings;
    private List<String> sauces;
    private boolean toasted;

    public Sandwich(BreadSize breadSize, BreadType breadType, List<String> meats,
                    List<String> cheeses, List<String> regularToppings, List<String> sauces, boolean toasted) {
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
        this.toasted = toasted;
    }

    public BreadSize getSize() {
        return breadSize;
    }

    public void setSize(BreadSize breadSize) {
        this.breadSize = breadSize;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public List<String> getMeats() {
        return meats;
    }

    public void setMeats(List<String> meats) {
        this.meats = meats;
    }

    public List<String> getCheeses() {
        return cheeses;
    }

    public void setCheeses(List<String> cheeses) {
        this.cheeses = cheeses;
    }

    public List<String> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(List<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
    public void addMeat(String meat) {
        meats.add(meat);
    }
    public void addCheese(String cheese) {
        cheeses.add(cheese);
    }
    public void addTopping(String topping) {
        regularToppings.add(topping);
    }
    public void addSauce(String sauce) {

        sauces.add(sauce);
    }
    public double calculateTotal() {
       BreadSizePrice breadSizePrice = new BreadSizePrice();
        double total = breadSizePrice.getPrice();
        total += meats.size() * 1.00;// add $1 per meat
        total += cheeses.size() * 0.75; // add $0.75 per cheese
        return total;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + breadSize +
                ", breadType=" + breadType +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", regularToppings=" + regularToppings +
                ", sauces=" + sauces +
                ", toasted=" + toasted +
                '}';
    }



}
