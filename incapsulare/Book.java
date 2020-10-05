package com.company.lab2.incapsulare;

public class Book {

    private double cost;
    private String year;
    private String author;
    private String title;
    private int nrPages;

    //constructorul nr. 1
    public Book(String author, String title, int nrPages) {
        this.author = author;
        this.title = title;
        this.nrPages = nrPages;
    }

    //constructorul nr. 2
    public Book(double cost, String year, String author, String title, int nrPages) {
        this.cost = cost;
        this.year = year;
        this.author = author;
        this.title = title;
        this.nrPages = nrPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNrPages() {
        return nrPages;
    }

    public void setNrPages(int nrPages) {
        this.nrPages = nrPages;
    }
}

