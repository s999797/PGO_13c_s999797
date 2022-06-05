package com.cwiczenia;

public class Root extends Plants{

    public Root(String name, int baseReagent, int toxcity) {
        super(name, baseReagent, toxcity);
    }

    @Override
    public int getReagent() {
        return super.getReagent()/2;
    }
}
