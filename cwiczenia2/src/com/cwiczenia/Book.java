package com.cwiczenia;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Book {

    private long ID;
    private String bookName;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount;
    private ArrayList<String> Author = new ArrayList<>();

    public ArrayList<String> getAuthor() {
        return Author;
    }

    public void setAuthor(ArrayList<String> author) {
        Author = author;
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

    public void setID(long ID) {
        this.ID = ID;
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

    public Book(){

    }
    public Book(String bookName, Genre genre, Lang language, LocalDate publishDate) {
        setBookName(bookName);
        setGenre(genre);
        setLanguage(language);
        setPublishDate(publishDate);

    }

}

