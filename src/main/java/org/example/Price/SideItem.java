package org.example.Price;

public class SideItem {
    private org.example.Enum.SideItem side;

    public SideItem(org.example.Enum.SideItem side) {
        this.side = side;

    }

    public org.example.Enum.SideItem getSide() {
        return side;
    }

    public void setSide(org.example.Enum.SideItem side) {
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

