package com.cwiczenia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Book {

    private static int Licznik = 1;

    //==========================================

    private long ID;
    private String bookName;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount;
    public Person osobaWypozyczajaca;
    private ArrayList<Person> authors = new ArrayList<>();

    public Book(String bookName, Genre genre, Lang language, LocalDate publishDate) {
        setBookName(bookName);
        setGenre(genre);
        setLanguage(language);
        setPublishDate(publishDate);
        ID = Licznik;
        Licznik++;
    }

    public long getID() {
        return ID;
    }

    public String getBookName() {
        return bookName;
    }

    public Genre getGenre() {
        return genre;
    }

    public Lang getLanguage() {
        return language;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setLanguage(Lang language) {
        this.language = language;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    public void addAuthor(Person p) {
        authors.add(p);
    }

    public void borrowBook(Person osobaWypozyczajaca) {
        this.osobaWypozyczajaca = osobaWypozyczajaca;
        osobaWypozyczajaca.wypozyczonaKsiazka = this;
    }

    public void placeBack() {
        if (osobaWypozyczajaca == null) {
            throw new IllegalArgumentException("Ksiażka nie jest wypozyczona, wiec nie moze zostac zwrocona");
        }

        osobaWypozyczajaca.oddajKsiazke();
        osobaWypozyczajaca = null;
    }

}

