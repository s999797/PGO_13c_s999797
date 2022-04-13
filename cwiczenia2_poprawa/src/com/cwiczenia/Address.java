package com.cwiczenia;

public class Address {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Address(String country, String city, String street, int house) {
        this.setCountry(country);
        this.setCity(city);
        this.setStreet(street);
        this.setHouse(house);
    }

    public Address(String country, String city, String street, int house, int flat) {
        this.setCountry(country);
        this.setCity(city);
        this.setStreet(street);
        this.setHouse(house);
        this.setFlat(flat);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country == null || country.isEmpty()){
            throw new IllegalArgumentException("Country cannot be null or empty.");
        }
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city == null || city.isEmpty()){
            throw new IllegalArgumentException("City cannot be null or empty.");
        }
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street == null || street.isEmpty()){
            throw new IllegalArgumentException("Street cannot be null or empty.");
        }
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        if(house <= 0){
            throw new IllegalArgumentException("Number of house cannot be negative or zero.");
        }
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        if(flat <= 0){
            throw new IllegalArgumentException("Number of flat cannot be negative or zero.");
        }
        this.flat = flat;
    }
}