package com.company.lab2.mostenire;

public class Emergency extends Hospital {

    private int nrCars;

    public Emergency(int nrPacients, int nrDoctors, int subsidiary, String region, String city, int nrCars) {
        super(nrPacients, nrDoctors, subsidiary, region, city);
        this.nrCars = nrCars;
    }

    @Override
    public String print() {
        return super.print() +
                "Numarul de masini : " + nrCars;
    }

    //afiseaza doar numarul de masini
    public String print(int nrCars) {
        return "Numarul de masini a filialei nr. " + getSubsidiary() + " : " + nrCars;
    }

    public int getNrCars() {
        return nrCars;
    }

    public void setNrCars(int nrCars) {
        this.nrCars = nrCars;
    }
}
