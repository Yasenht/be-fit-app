package com.example.yas;

public class Item {
    String name,discriptoion;
    int imeg;

    public Item(String name, String discriptoion, int imeg) {
        this.name = name;
        this.discriptoion = discriptoion;
        this.imeg = imeg;
    }

    public String getdiscriptoion() {
        return discriptoion;
    }

    public void setdiscriptoion(String discriptoion) {
        this.discriptoion = discriptoion;
    }

    public int getImeg() {
        return imeg;
    }

    public void setImeg(int imeg) {
        this.imeg = imeg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
