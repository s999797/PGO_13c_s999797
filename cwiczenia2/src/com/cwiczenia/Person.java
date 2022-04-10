package com.cwiczenia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private String personName;
    private String surname;
    private LocalDate dateOfBirth;
    public Book wypozyczonaKsiazka;
    private Adress address;
    private ArrayList<Book> ksiazkiMojegoAutorstwa = new ArrayList<>();

    public Person(String personName, String surname, LocalDate dateOfBirth, Adress adress) {
        setPersonName(personName);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
        this.address = adress;
    }

    public void oddajKsiazke() {
        wypozyczonaKsiazka = null;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        int y1 = LocalDate.now().getYear();
        int y2 = dateOfBirth.getYear();
        return y1 - y2;
    }

    public Book publishBook(String bookName, Genre genre, Lang language, LocalDate publishDate) {
        Book book = new Book(bookName, genre, language, publishDate);
        this.ksiazkiMojegoAutorstwa.add(book);
        book.addAuthor(this);
        return book;
    }
}

