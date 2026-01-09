package com.example.petshop;

public class Dog extends Pet implements Pettable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "bark"; // Dogs bark
    }

    @Override
    public void pet() {
    }
}
