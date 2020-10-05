package com.company.lab2.mostenire;

public class LuxuryCar extends Car {

    private int price;
    private String color;
    private double condition; // de la 1 la 10

    public LuxuryCar(String mark, String year, int mileageMeter, char motorType, String carType, int price, String color, double condition) {
        super(mark, year, mileageMeter, motorType, carType);
        this.price = price;
        this.color = color;
        this.condition = condition;
    }

    @Override
    public String print() {
        return super.print() +
                "Pretul automobilului : " + price + "\n" +
                "Culoarea : " + color + "\n" +
                "Starea : " + condition + "\n";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCondition() {
        return condition;
    }

    public void setCondition(byte condition) {
        this.condition = condition;
    }
}
