package com.cwiczenia;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
            Person p=new Person();
            Person p2=new Person();

            Book newBook=p.PublishBook("", Genre.Classic);
            newBook.addAuthor(p2);
    }
}
