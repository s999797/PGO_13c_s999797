package com.cwiczenia;

import java.util.ArrayList;

public class Storage {
    private int deliveryTime;
    private ArrayList<Products> productsStorage = new ArrayList<>();

    public Storage(int deliveryTime) {
        setDeliveryTime(deliveryTime);
    }

    public ArrayList<Products> getProductsStorage() {
        return productsStorage;
    }

    public void setProductsStorage(ArrayList<Products> productsStorage) {
        this.productsStorage = productsStorage;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if(deliveryTime <= 0){
            throw new IllegalArgumentException("Delivery time have to be positive.");
        }
        this.deliveryTime = deliveryTime;
    }
    public void AddProductToStorage(Products product){
        if(product.getAssignStorage()){
            throw new IllegalArgumentException("Product was added to storage. Please check your storage.");
        }
        this.productsStorage.add(product);
        product.setStorage(this);
        product.setAssignStorage(true);
    }

}
