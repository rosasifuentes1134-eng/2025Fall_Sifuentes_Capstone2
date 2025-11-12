package org.example.Price;

import org.example.Enum.SideItems;

public class SideItem {
    private SideItems side;

    public SideItem(SideItems side) {
        this.side = side;

    }

    public SideItems getSide() {
        return side;
    }

    public void setSide(SideItems side) {
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
    public double chips(){
        return 1.50;
    }

}

