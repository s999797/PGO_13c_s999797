package com.cwiczenia;

public class Flower extends Plants{

    public Flower(String name, int baseReagent, int toxcity) {
        super(name, baseReagent, toxcity);
    }

    @Override
    public int getReagent() {
        return 2 * super.getReagent();
    }
}
