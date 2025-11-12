package org.example.Price;

import org.example.Enum.Drink;



public class DrinkPrice {
    private Drink size;
    private Drink drink;

    public DrinkPrice(Drink size) {
        this.size = size;
        this.drink = drink;
    }

    public Drink getSize() {
        return size;
    }

    public void setSize(Drink size) {

        this.size = size;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public double getPrice(){
        double price;
        switch (size){

            case SMALL:
                price = 2.00 ;
                break;
            case MEDIUM:
                price  = 2.50;
                break;
            case LARGE:
                price = 3.00;
                break;
            default:
                return 0;
        }
        return price;
    }


    }

