package org.example.Price;

import org.example.Enum.Cheese;

public class CheesePrice {
    private Cheese type;

    public CheesePrice(Cheese type) {
        this.type = type;
    }

    public Cheese getType() {
        return type;
    }

    public void setType(Cheese type) {
        this.type = type;
    }

    public double getPrice() {
        double price;
        switch (type) {
            case AMERICAN:
            case PROVOLONE:
            case CHEDDAR:
            case SWISS:
                price = 0.75;
                break;
            case EXTRA_CHEESE:
                price = 0.30;
                break;
            default:
                return 0.0;
        }
        return price;
    }
}