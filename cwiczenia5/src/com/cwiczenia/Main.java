package com.cwiczenia;

public class Main {

    public static void main(String[] args) {


        Water water = new Water("H2O", 12, 14, true);
        Alcohol alcohol = new Alcohol("Etanol", 1, 1,50);
        Ore ore = new Ore("Carbon", 1, 6, false);
        Crystal crystal = new Crystal("Sodium chloride", 100, 200,5);
        Flower flower = new Flower("Poinsettia", 1, 1);
        Root root = new Root("Carrot", 10, 10);

        Eliksir eliksir = new Eliksir("Mixture");

        eliksir.addIngredient(water);
        eliksir.addIngredient(alcohol);
        eliksir.addIngredient(ore);
        eliksir.addIngredient(crystal);
        eliksir.addIngredient(flower);
        eliksir.addIngredient(root);

        eliksir.setCatalyst(water);

        eliksir.Create();
        System.out.println(eliksir);

        Water water2 = new Water("H2O", 10, 3, false);
        Alcohol alcohol2 = new Alcohol("Denaturant", 1234, 1,100);
        Ore ore2 = new Ore("Iron", 124, 6435, true);
        Crystal crystal2 = new Crystal("Sodium chloride", 100, 123456789,232434);
        Flower flower2 = new Flower("Poinsettia", 1343, 14);
        Root root2 = new Root("Carrot", 434, 35);

        Eliksir eliksir2 = new Eliksir("Mixture2");

        eliksir2.addIngredient(water2);
        eliksir2.addIngredient(alcohol2);
        eliksir2.addIngredient(ore2);
        eliksir2.addIngredient(crystal2);
        eliksir2.addIngredient(flower2);
        eliksir2.addIngredient(root2);

        eliksir2.setCatalyst(alcohol2);

        eliksir2.Create();
        System.out.println(eliksir2);

        //The same elixir but without ore (ore was removed by removeIngredient() method).
        System.out.println("The same elixir as Mixture2 but without ore (ore was removed by removeIngredient() method).");

        Eliksir eliksir3 = new Eliksir("Mixture3");

        eliksir3.addIngredient(water2);
        eliksir3.addIngredient(alcohol2);
        eliksir3.addIngredient(ore2);
        eliksir3.addIngredient(crystal2);
        eliksir3.addIngredient(flower2);
        eliksir3.addIngredient(root2);

        eliksir3.setCatalyst(alcohol2);

        eliksir3.removeIngredient(ore2);

        eliksir3.Create();
        System.out.println(eliksir3);

    }
}
