package org.example.Price;

import org.example.Enum.Meat;

public class MeatPrice {
    private Meat type;

    public MeatPrice(Meat type) {
        this.type = type;
    }

    public Meat getType() {
        return type;
    }

    public void setType(Meat type) {
        this.type = type;
    }
    public double getPrice(){
        double price;
        switch (type){

            case STEAK:
            case HAM:
            case SALAMI:
            case ROAST_BEEF:
            case CHICKEN:
            case BACON:
                price = 1.00;
                break;
            case EXTRA_MEAT:
                price = 0.50;
                break;
            default:
                return 0;
        }
        return price;
    }
}
