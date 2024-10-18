package com.example.task02;

public class DiscountBill extends Bill {

    private float discount;

    public DiscountBill(float discount) {
        this.discount = discount;
    }

    public long getDiscountInPercent() {
        return (long) (discount * 100);
    }

    public long getDiscountPrice() {
        return (long) (super.getPrice() * discount);
    }

    @Override
    public long getPrice() {
        return (long) (super.getPrice() * (1 - discount));
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Скидка: " + getDiscountInPercent() + "%\n" +
                "Скидка: " + getDiscountPrice() + " руб.\n";
    }
}
