package com.cwiczenia;

import java.util.ArrayList;

public class Orphanage {
    private String name;
    private Location location;
    private Child child;
    ArrayList<Child> orphans = new ArrayList<>();

    public String getName() {
        return name;
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

    public Orphanage(String name, Location location) {
        setName(name);
        setLocation(location);
    }
    public void addChild(Child child){
        orphans.add(this.child);
        child.setLocation(Location.London);
    }
}
