package com.cwiczenia;

import java.util.*;

public class Character {

    private String name;
    private Location location;
    private Orphanage orphanage;
    private int points = 100;
    private static
    ArrayList<Character> listOfCharacters = new ArrayList<>();
    ArrayList<Character> listOfTargets = new ArrayList<>();
    public String getName() {
        return name;
    }

    public Orphanage getOrphanage() {
        return orphanage;
    }

    public void setOrphanage(Orphanage orphanage) {
        this.orphanage = orphanage;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static ArrayList<Character> getListOfCharacters() {
        return listOfCharacters;
    }

    public static void setListOfCharacters(ArrayList<Character> listOfCharacters) {
        Character.listOfCharacters = listOfCharacters;
    }

    public ArrayList<Character> getListOfTargets() {
        return listOfTargets;
    }

    public void setListOfTargets(ArrayList<Character> listOfTargets) {
        this.listOfTargets = listOfTargets;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null.");
        }
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if(location == null){
            throw new IllegalArgumentException("Location cannot be null.");
        }
        this.location = location;
    }

    public Character(String name, Location location) {
        setName(name);
        setLocation(location);
        listOfCharacters.add(this);
    }
    public void introduce(){
        System.out.println("Hello, I am " + this.name);
    }
    public void moveTo(Location location){
        this.location = location;
    }
    public void moveTo(Orphanage woolsOrphanage){
        this.location = woolsOrphanage.getLocation();
    }
    public static void MoveAllTo(Location location, Character character1, Character character2){
        character1.setLocation(location);
        character2.setLocation(location);
    }
    public void say(String text, Character character){
        System.out.println(this.name + " to " + character.getName());
        System.out.println("\t\t" + text);
    }
    public void doSth(String text){
        System.out.println("I am " + this.name + ", I am " + text);
    }
    public static void status(){
        System.out.println("====Status====");
        for (int i = 0; i < listOfCharacters.size(); i++) {
            System.out.println(listOfCharacters.get(i).name + " : " + listOfCharacters.get(i).points);
        }
        System.out.println("==============");
    }
    public static void doSth(String text, Character character1, Character character2, Character character3){
        System.out.println("I am " + character1.name + ", I am " + text);
        System.out.println("I am " + character2.name + ", I am " + text);
        System.out.println("I am " + character3.name + ", I am " + text);
    }
    public void target(Character character){
        listOfTargets.add(character);
    }


}
