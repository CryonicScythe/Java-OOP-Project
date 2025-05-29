package com.example;

import java.util.ArrayList;

public class ItemCreater {

    public static ArrayList<Item> bagList = new ArrayList<Item>();
    public static ArrayList<Item> storeList = new ArrayList<Item>();

    // Adds an item to the inventory
    public static void addItem(String name, String type, int value, int damage){
        Item added = new Item(name, type, value, damage);
        bagList.add(added);
    }

    public static void addItem(String name, String type, int value){
        Item added = new Item(name, type, value);
        bagList.add(added);
    }

    // Adds an item to the store
    public static void storeItem(String name, String type, int value, int damage){
        Item added = new Item(name, type, value, damage);
        storeList.add(added);
    }
}
