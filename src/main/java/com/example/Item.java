package com.example;

public class Item {
    
    private String name;
    private String type;
    private int value;
    private int damage;

    public Item(String name, String type, int value, int damage){
        this.name = name;
        this.type = type;
        this.value = value;
        this.damage = damage;
    }

    public Item(String name, String type, int value){
        this.name = name;
        this.type = type;
        this.value = value;
    }
}
