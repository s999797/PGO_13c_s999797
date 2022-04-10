package com.cwiczenia;


import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Person p = new Person("Jan", "Kowalski", LocalDate.now(), null);

        Book b = new Book("Pozegnanie z bronia", Genre.Adventure, Lang.English, LocalDate.now());
        b.borrowBook(p);

        p.wypozyczonaKsiazka = b;
        b.osobaWypozyczajaca = p;

        //oddaj ksiazke
        p.wypozyczonaKsiazka = null;
        b.osobaWypozyczajaca = null;
    }
}
