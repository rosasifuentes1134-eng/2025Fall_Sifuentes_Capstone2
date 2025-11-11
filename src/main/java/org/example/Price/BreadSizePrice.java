package org.example.Price;


import org.example.Enum.BreadSize;

public class BreadSizePrice {
    private BreadSize size;

    public BreadSizePrice(BreadSize size) {

        this.size = size;
    }

    public BreadSizePrice() {

    }

    public BreadSize getSize() {
        return size;
    }

    public void setSize(BreadSize size) {
        this.size = size;
    }

    public double getPrice(){
        double price;
        switch (size){

            case FOUR_INCH:
                price = 5.50;
                break;
            case EIGHT_INCH:
                price = 7.00;
                break;
            case TWELVE_INCH:
                price = 8.50;
                break;
            default:
                return 0;
        }
        return price;
    }
}

