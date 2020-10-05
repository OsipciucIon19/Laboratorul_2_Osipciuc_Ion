package com.company.lab2;

import com.company.lab2.incapsulare.Book;
import com.company.lab2.incapsulare.Student;
import com.company.lab2.mostenire.Hospital;
import com.company.lab2.mostenire.Emergency;
import com.company.lab2.mostenire.LuxuryCar;
import com.company.lab2.mostenire.OffRoadCar;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------------\nIncapsularea\n----------------------------\n");

        Student ion = new Student("Ion",'M',19,170,60), dan = new Student("Dan",'M',20,160,55);
        System.out.println("Nume : " + ion.getName());
        System.out.println("Sex : " + ion.getSex());
        System.out.println("Varsta : " + ion.getAge());
        System.out.println("Inaltime : " + ion.getHeight());
        System.out.println("Greutate : " + ion.getWeight());

        System.out.println("----------------------------");

        System.out.println("Nume : " + dan.getName());
        System.out.println("Sex : " + dan.getSex());
        System.out.println("Varsta : " + dan.getAge());
        System.out.println("Inaltime : " + dan.getHeight());
        System.out.println("Greutate : " + dan.getWeight());

        System.out.println("----------------------------");

        Student grigore = new Student("Grigore",18);
        grigore.setAge(20);
        System.out.println("Varsta lui " + grigore.getName() + " : " + grigore.getAge());

        System.out.println("----------------------------");

        Book book1 = new Book("Nicolae Dabija", "Tema pentru acasa",243);
        System.out.println("Autorul: " + book1.getAuthor());
        System.out.println("Titlul: " + book1.getTitle());
        System.out.println("Numarul de pagini: " + book1.getNrPages());

        System.out.println("----------------------------");

        Book book2 = new Book(20.5D,"2001","Liviu Rebreanu","Padurea Spanzuratilor",333);
        System.out.println("Costul: " + book2.getCost());
        System.out.println("Anul: " + book2.getYear());
        System.out.println("Autorul: " + book2.getAuthor());
        System.out.println("Titlul: " + book2.getTitle());
        System.out.println("Numarul de pagini: " + book2.getNrPages());

        System.out.println("----------------------------");

        book2.setCost(200.89D);
        System.out.println("Costul cartii "+ "\"" + book2.getTitle() + "\"" + " este : " + book2.getCost());

        System.out.println("\n----------------------------\nMostenirea\n----------------------------\n");

        Hospital spitalul1 = new Hospital(100,20,13,"Chisinau", "Bubuieci");
        System.out.println(spitalul1.print());

        System.out.println("----------------------------");

        Emergency spitalul2 = new Emergency(54, 11, 3, "Chisinau", "Bacioi", 7);
        System.out.println(spitalul2.print());

        System.out.println("----------------------------");

        System.out.println(spitalul2.print(spitalul2.getNrCars()));

        System.out.println("----------------------------");

        OffRoadCar car1 = new OffRoadCar("Land Rover", "2000", 10000, 'D', "Off-Road", 3.3D, 150);
        System.out.println(car1.print());

        System.out.println("----------------------------");

        LuxuryCar car2 = new LuxuryCar("Mercedes", "2018", 5000, 'B', "Luxury", 150000, "black", 9.5D);
        System.out.println(car2.print());


    }
}
