package com.example;

import java.util.ArrayList;

public class ItemCreater {

    public ArrayList<Item> bagList;

    public ItemCreater() {
        bagList = new ArrayList<Item>();
    }

    // Adds an item to the inventory
    public void addItem(String name, String type, int value, int damage){
        Item added = new Item(name, type, value, damage);
        bagList.add(added);
    }

    public void addItem(String name, String type, int value){
        Item added = new Item(name, type, value);
        bagList.add(added);
    }

}
