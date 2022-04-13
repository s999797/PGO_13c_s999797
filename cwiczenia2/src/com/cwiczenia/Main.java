package com.cwiczenia;


import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Person p = new Person("Jan", "Kowalski", LocalDate.now(), null);

        Book b = new Book("Pozegnanie z bronia", Genre.Adventure, Lang.English, LocalDate.now());
        b.borrowBook(p);

        p.wypozyczonaKsiazka = b;
        b.osobaWypozyczajaca = p;
        //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
        //oddaj ksiazke
        p.wypozyczonaKsiazka = null;
        b.osobaWypozyczajaca = null;
    }
}
