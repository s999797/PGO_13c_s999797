package com.cwiczenia;

import java.util.ArrayList;

public class ShoppingCart {
    private static int Counter = 1;
    private int id;
    private ArrayList<Products> ProductsList = new ArrayList<>();
    private int numberOfProducts;
    private ArrayList<Integer> numberOfProductsList = new ArrayList<>();

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public ArrayList<Integer> getNumberOfProductsList() {
        return numberOfProductsList;
    }

    public void setNumberOfProductsList(ArrayList<Integer> numberOfProductsList) {
        this.numberOfProductsList = numberOfProductsList;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        if(numberOfProducts <= 0){
            throw new IllegalArgumentException("Number of products have to be positive.");
        }
        this.numberOfProducts = numberOfProducts;
    }

    public ShoppingCart() {
        id = Counter;
        Counter ++;
    }
    public int getId() {
        return id;
    }

    public ArrayList<Products> getProductsList() {
        return ProductsList;
    }

    public void setProductsList(ArrayList<Products> ProductsList) {
        this.ProductsList = ProductsList;
    }

    public double TotalPrice(){
        double sum = 0;
        for (int i = 0; i < this.ProductsList.size(); i++) {
            sum += this.ProductsList.get(i).getPrice()*this.numberOfProductsList.get(i);
        }
        return sum;
    }
    public int TotalDeliveryTime(){
        int maximum = 0;
        for (int i = 0; i < this.getProductsList().size(); i++) {
            if(ProductsList.get(i).getStorage() == null){
                continue;
            }
            if(this.getProductsList().get(i).getStorage().getDeliveryTime() > maximum){
                maximum = this.getProductsList().get(i).getStorage().getDeliveryTime();
            }
        }
        return maximum;
    }
    public void AddProducts(Products products, int numberOfProducts){
        if(numberOfProducts <= 0){
            throw new IllegalArgumentException("Number of products have to be positive.");
        }else{
            for(int i = 0; i < ProductsList.size(); i++) {
                if(products.getName().equals(ProductsList.get(i).getName())){
                    throw new IllegalArgumentException("You cannot choose the same product. Please check your shopping cart.");
                }
            }
            if(products.getQuantity() >= numberOfProducts){
                if(products.getisAvailable()){
                    this.ProductsList.add(products);
                    this.numberOfProductsList.add(numberOfProducts);
                    System.out.println("Added " + numberOfProducts + "x " + products.getName());
                }
                else{
                    System.out.println("The product " +products.getName()+" is unavailable.");
                }
            }
            else{
                throw new IllegalArgumentException("Too many products were added. Available number of products are "+products.getQuantity());
            }
        }
    }
    public void Sell (){
        for (int i = 0; i < this.ProductsList.size(); i++) {
            for (int j = 1; j <= this.numberOfProductsList.get(i); j++) {
                this.ProductsList.get(i).Sell();
            }
        }
    }
}
