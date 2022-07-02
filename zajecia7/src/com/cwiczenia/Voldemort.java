package com.cwiczenia;

import java.util.ArrayList;

public class Voldemort extends Character {
    private static int Counter = 1;
    private int ID;
    private ArrayList<String> listOfHorcruxe = new ArrayList<>();
    public Voldemort(String name, Location location) {
        super(name, location);
    }
    public Voldemort(Riddle riddle) {
        super("Lord Voldemort", riddle.getLocation());
    }
    public void createHorcruxes(int x){
        for (int i = 0; i < x ; i++) {
            listOfHorcruxe.add("horcrux");
        }
    }
    public void printHorcruxes(){
        System.out.println("Created horcruxes:");
        for (int i = 1; i <= listOfHorcruxe.size(); i++) {
            System.out.println(listOfHorcruxe.get(i-1) + " " + i);
        }
    }
    public void castSpell(Spell avadaKedavra){
        Spell spell = Spell.AvadaKedavra;
        if(spell.equals(Spell.AvadaKedavra)){
            for (int i = 0; i < listOfTargets.size(); i++) {
                if (!(listOfTargets.get(i).getName().equals("Harry"))){
                    listOfTargets.get(i).setPoints(0);
                }
                this.setPoints(0);
            }


        }
    }

}
