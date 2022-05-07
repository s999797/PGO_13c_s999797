package com.cwiczenia;

public class Products {
    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private boolean isAvailable;
    private ShoppingCart shoppingCart;
    private Storage storage;
    private boolean assignStorage = false;

    public Products(String name, ProductType productType, double price, int quantity) {
        setName(name);
        setProductType(productType);
        setPrice(price);
        setQuantity(quantity);
        isAvailable = true;

    }

    public boolean getAssignStorage() {
        return assignStorage;
    }

    public void setAssignStorage(boolean assignStorage) {
        this.assignStorage = assignStorage;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public boolean getisAvailable() {
        return isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name == null){
            throw new IllegalArgumentException("Name cannot be null.");
        }
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException("Price have to be positive.");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            throw new IllegalArgumentException("Quantity have to be positive.");
        }
        this.quantity = quantity;
    }

    public void Sell(){
        if(this.quantity > 0){
            this.quantity --;
        }
        if(this.quantity == 0){
            this.isAvailable = false;
        }

    }
    public void IncreaseQuantity(int itemIncreaser){
        this.quantity += itemIncreaser;
    }
    public int showDeliveryTime(){
        if(!this.assignStorage){
            return 0;
        }
        return storage.getDeliveryTime();
    }
}
