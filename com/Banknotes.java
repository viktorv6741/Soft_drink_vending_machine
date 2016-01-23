package com;

public class Banknotes implements Money {

    private int value;

    public Banknotes(int value) {
        this.value = value;
    }

    @Override
    public void pay() {
        System.out.println(value + " Dollars");
    }



    public void setValue(int value) {
        this.value = value;
    }
}
