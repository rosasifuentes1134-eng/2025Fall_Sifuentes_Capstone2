package org.example.Price;

import org.example.Enum.Drink;



public class DrinkPrice {
    private Drink size;

    public DrinkPrice(Drink size) {
        this.size = size;
    }

    public Drink getSize() {
        return size;
    }

    public void setSize(Drink size) {
        this.size = size;
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

