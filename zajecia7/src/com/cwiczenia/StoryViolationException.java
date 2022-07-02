package com.cwiczenia;

public class StoryViolationException extends RuntimeException {

    public StoryViolationException(String message) {
        super(message);
    }
    public void printMessage(){
        System.out.println("Voldemort cannot come to Hogwarts.");
    }
}
