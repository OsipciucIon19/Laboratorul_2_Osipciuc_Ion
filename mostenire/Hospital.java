package com.company.lab2.mostenire;

public class Hospital {

    private int nrPacients;
    private int nrDoctors;
    private int subsidiary;
    private String region;
    private String city;

    public Hospital(int nrPacients, int nrDoctors, int subsidiary, String region, String city) {
        this.nrPacients = nrPacients;
        this.nrDoctors = nrDoctors;
        this.subsidiary = subsidiary;
        this.region = region;
        this.city = city;
    }

    public String print() {
        return "Numarul de pacienti : " + nrPacients + "\n" +
                "Numarul de doctori : " + nrDoctors + "\n" +
                "Numarul filialei : " + subsidiary + "\n" +
                "Regiunea : " + region + "\n" +
                "Orasul : " + city + "\n";
    }

    public int getNrPacients() {
        return nrPacients;
    }

    public void setNrPacients(int nrPacients) {
        this.nrPacients = nrPacients;
    }

    public int getNrDoctors() {
        return nrDoctors;
    }

    public void setNrDoctors(int nrDoctors) {
        this.nrDoctors = nrDoctors;
    }

    public int getSubsidiary() {
        return subsidiary;
    }

    public void setSubsidiary(int subsidiary) {
        this.subsidiary = subsidiary;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
