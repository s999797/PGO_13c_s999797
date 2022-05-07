package com.cwiczenia;
import java.time.LocalDate;
import java.util.ArrayList;


public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private ArrayList<Book> myBooks = new ArrayList<>();
    private Address address;
    private Book borrowedBook;

    public Person(String name, String surname, LocalDate dateOfBirth, Address address) {
        this.setName(name);
        this.setSurname(surname);
        this.setDateOfBirth(dateOfBirth);
        this.address = address;
    }

    public ArrayList<Book> getMyBooks() {
        return myBooks;
    }

    public void setMyBooks(ArrayList<Book> myBooks) {
        this.myBooks = myBooks;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname == null || surname.isEmpty()){
            throw new IllegalArgumentException("Surname cannot be null or empty.");
        }
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth == null){
            throw new IllegalArgumentException("Date of birth cannot be null.");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public int getBirthAge(){
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public void addBook(Book book){
        myBooks.add(book);
    }

    public void  dodajKsiazke(Book b){
        this.myBooks.add(b);
        b.addAuthor(this);
    }

    public Book PublishBook(String bookName, Genre genre, Lang language, LocalDate publishDate){
        Book book = new Book(bookName, genre, language, publishDate, this);
        this.dodajKsiazke(book);
        return book;
    }

    public void ReturnBook() {
        borrowedBook = null;
    }
}