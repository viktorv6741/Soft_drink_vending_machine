package com;

public class Coins implements Money {

    private int value;

    public Coins(int value) {
        this.value = value;
    }

    @Override
    public void pay() {
        System.out.println(value + " Cents");
    }
}
