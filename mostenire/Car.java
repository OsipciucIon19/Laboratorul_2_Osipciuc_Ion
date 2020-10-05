package com.company.lab2.mostenire;

public class Car {

    private String mark;
    private String year;
    private int mileageMeter; //contorul de parcurs
    private char motorType;
    private String carType;

    public Car(String mark, String year, int mileageMeter, char motorType, String carType) {
        this.mark = mark;
        this.year = year;
        this.mileageMeter = mileageMeter;
        this.motorType = motorType;
        this.carType = carType;
    }

    public String print() {
        return "Marca automobilului : " + mark + "\n" +
                "Anul producerii : " + year + "\n" +
                "Kilometraj : " + mileageMeter + "\n" +
                "Tipul motorului : " + motorType + "\n" +
                "Tipul automobilului : " + carType + "\n";
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getMileageMeter() {
        return mileageMeter;
    }

    public void setMileageMeter(int mileageMeter) {
        this.mileageMeter = mileageMeter;
    }

    public char getMotorType() {
        return motorType;
    }

    public void setMotorType(char motorType) {
        this.motorType = motorType;
    }
}
