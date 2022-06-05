package com.cwiczenia;

import java.util.ArrayList;
import java.util.List;

public class Eliksir {
    private String name;
    private boolean isCreated = false;
    private int power;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Liquid catalyst;
    String listOfIngredients = "[";

    public Eliksir(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name == null){
            throw new IllegalArgumentException("Name cannot be empty or null.");
        }
        this.name = name;
    }

    public boolean isCreated() {
        return isCreated;
    }

    public void setCreated(boolean created) {
        isCreated = created;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Liquid catalyst) {
        if(isCreated){
            throw new IllegalArgumentException("Unavailable because Elixir was prepared.");
        }
        this.catalyst = catalyst;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(isCreated){
            throw new IllegalArgumentException("Unavailable because Elixir was prepared.");
        }
        this.power = power;
    }
    public void addIngredient(Ingredient ingredient){
        if(isCreated){
            throw new IllegalArgumentException("Elixir was created and you cannot add an ingredient to list.");
        }
        ingredients.add(ingredient);
    }
    public void removeIngredient(Ingredient ingredient){
        if(isCreated){
            throw new IllegalArgumentException("Elixir was created and you cannot remove an ingredient from list.");
        }
        ingredients.remove(ingredient);
    }
    public void Create(){
        isCreated = true;
        power = 0;
        for (Ingredient ingredient : ingredients) {
            power += ingredient.getReagent();
        }
        if(catalyst.getReagent() == 0){
            throw  new IllegalArgumentException("You cannot divide by zero.");
        }
        power = power/catalyst.getReagent();
    }
    public String ingredientsListToString(){

        for (int i = 0; i < ingredients.size() - 1; i++) {
            listOfIngredients += ingredients.get(i).getName() + ": reagent = " + ingredients.get(i).getReagent() + ", ";
        }
        listOfIngredients += ingredients.get(ingredients.size() - 1).getName() + ": reagent = " + ingredients.get(ingredients.size() - 1).getReagent() + "]";
        return listOfIngredients;
    }
    @Override
    public String toString() {
        return "Eliksir data {" +
                "name = '" + name + '\'' +
                ", isCreated = " + isCreated +
                ", power = " + power +
                ", ingredients and reagents = " + ingredientsListToString() +
                ", catalyst = " + catalyst.getName() +": reagent = " + catalyst.getReagent() +
                '}';
    }
}
