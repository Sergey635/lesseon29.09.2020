package com.company;

public class Hostel2 extends BaseHousing {
    public Hostel2(String name, String description, int price) {
        super(name, description, price);
    }

    @Override
    public int getTotalPrice() {
        return super.getPrice();
    }
}
