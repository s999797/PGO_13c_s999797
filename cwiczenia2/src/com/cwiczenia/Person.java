package com.cwiczenia;

import javax.security.sasl.AuthorizeCallback;
import java.time.LocalDate;

public class Person {
    private String personName;
    private String surname;
    private LocalDate dateOfBirth;

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

    public Person(String personName, String surname, LocalDate dateOfBirth) {
        setPersonName(personName);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
    }
    public Book PublishBook(String bookName, Genre genre, Lang language, LocalDate publishDate) {
        Book book = new Book(bookName, genre, language, publishDate);
        return book;
    }
}

