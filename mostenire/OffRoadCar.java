package com.company.lab2.mostenire;

public class OffRoadCar extends Car {

    private double weight; //masurat in tone
    private int power; // masurat in cai-putere

    public OffRoadCar(String mark, String year, int mileageMeter, char motorType, String carType, double weight, int power) {
        super(mark, year, mileageMeter, motorType, carType);
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String print() {
        return super.print() +
                "Greutatea automobilului : " + weight + "\n" +
                "Puterea motorului : " + power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
