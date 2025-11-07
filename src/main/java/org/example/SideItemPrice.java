package org.example;

import org.example.Enum.SideItem;

public class SideItemPrice {
    private SideItem side;

    public SideItemPrice(SideItem side) {
        this.side = side;

    }

    public SideItem getSide() {
        return side;
    }

    public void setSide(SideItem side) {
        this.side = side;
    }
    public double getPrice() {
        double price;
        switch (side) {
            case CHIPS:
                return 1.50;
            case AU_JUS:
                return 0;
            case SAUCE:
                return 0;
            default:
                return 0;
        }

    }
}

