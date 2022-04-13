package com.cwiczenia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Book {
    private static int Counter = 1;

    private int ID;
    private String bookName;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount = 0;
    private ArrayList<Person> authors = new ArrayList<>();
    private Person personWhoBorrowBook;
    private boolean isAvailable = true;
    private int bookAge;
    private Person author;

    public Book(String bookName, Genre genre, Lang language, LocalDate publishDate) {
        this.setBookName(bookName);
        this.setGenre(genre);
        this.setLanguage(language);
        this.setPublishDate(publishDate);
        ID = Counter;
        Counter++;
    }

    public Book (String bookName, Genre genre, Lang language, LocalDate publishDate, Person author){
        this.setBookName(bookName);
        this.setGenre(genre);
        this.setLanguage(language);
        this.setPublishDate(publishDate);
        this.setAuthor(author);
        ID = Counter;
        Counter++;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        if(author == null){
            throw new IllegalArgumentException("Person cannot be null.");
        }
        this.author = author;
    }

    public int getID() {
        return ID;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if(bookName == null || bookName.isEmpty()){
            throw new IllegalArgumentException("Name of book cannot be null or empty.");
        }
        this.bookName = bookName;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Lang getLanguage() {
        return language;
    }

    public void setLanguage(Lang language) {
        this.language = language;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public ArrayList<Person> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Person> authors) {
        this.authors = authors;
    }

    public void addAuthor(Person person){
        authors.add(person);
    }

    public int getPublishAge(){
        bookAge = LocalDate.now().getYear() - publishDate.getYear();
        return bookAge;
    }

    public Person BorrowBook(Person personWhoBorrowBook){
        if(isAvailable == false){
            throw new IllegalArgumentException("Book is not available");
        }
        if(personWhoBorrowBook.getBorrowedBook() != null){
            throw new IllegalArgumentException("You cannot borrow more than 1 book.");
        }
        this.personWhoBorrowBook = personWhoBorrowBook;
        personWhoBorrowBook.setBorrowedBook(this);
        borrowCount++;
        this.isAvailable = false;
        return personWhoBorrowBook;
    }

    public void PlaceBook(){
        if (personWhoBorrowBook == null) {
            throw new IllegalArgumentException("Book cannot be return because it is available in the library.");
        }
        personWhoBorrowBook.ReturnBook();
        personWhoBorrowBook = null;
        this.isAvailable = true;
    }
}
