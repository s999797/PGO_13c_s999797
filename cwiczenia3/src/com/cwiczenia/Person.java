package com.cwiczenia;

import java.util.ArrayList;

public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart current;
    private ArrayList<ShoppingCart> purchaseHistory = new ArrayList<>();

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        setName(name);
        setSurname(surname);
        setMoneyInCash(moneyInCash);
        setMoneyOnCard(moneyOnCard);
    }

    public ShoppingCart getCurrent() {
        return current;
    }

    public void setCurrent(ShoppingCart current) {
        this.current = current;
    }

    public ArrayList<ShoppingCart> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(ArrayList<ShoppingCart> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null.");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname == null || surname.isEmpty()){
            throw new IllegalArgumentException("Surname cannot be null.");
        }
        this.surname = surname;
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }

    public void setMoneyInCash(double moneyInCash) {
        if(moneyInCash < 0){
            throw new IllegalArgumentException("Money cannot be negative.");
        }
        this.moneyInCash = moneyInCash;
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        if(moneyOnCard < 0){
            throw new IllegalArgumentException("Credit card balance cannot be negative.");
        }
        this.moneyOnCard = moneyOnCard;
    }
    public ShoppingCart MakeOrder(){
        if(current == null){
            this.current = new ShoppingCart();
        }else{

            throw new IllegalArgumentException("Currently, you have a shopping cart. Please check your shopping.");
        }
        return current;
    }

    public void BuyByCard (){
        if(current != null){
            if(this.moneyOnCard >= this.current.TotalPrice()){
                System.out.println("Payment successful!");
                purchaseHistory.add(this.current);
                this.moneyOnCard = this.moneyOnCard - this.current.TotalPrice();
                current.Sell();
                current = null;
            }
            else{
                System.out.println("You don't have enough money on your credit card.");
            }
        }else{
            System.out.println("Your current shopping cart is empty.");
        }

    }
    public void BuyInCash (){
        if(current != null){
            if(this.moneyInCash >= this.current.TotalPrice()){
                System.out.println("Payment successful!");
                purchaseHistory.add(this.current);
                this.moneyInCash = this.moneyInCash - this.current.TotalPrice();
                current.Sell();
                current = null;

            }
            else{
                System.out.println("You don't have enough money.");
            }
        }else{
            System.out.println("Your current shopping cart is empty.");
        }

    }

}