package com.company;

public class Car {

    private int horsePower;
    private String color;

    Car() {

    }

    Car(int horsePower, String color) {
        this.horsePower = horsePower;
        this.color = color;
    }

    Car(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getHorsePower(int x, float y) {
        return horsePower;
    }

    public int getHorsePower(int x, int y) {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public float addition(float a, float b) {
        return a + b;
    }

}
