package com.example;

import java.util.ArrayList;

public class StoreCreator extends ItemCreater {

    public ArrayList<Item> storeList;

    public StoreCreator() {
        this.storeList = new ArrayList<Item>();
    }
    
    // Adds an item to the store
    public void storeItem(String name, String type, int value, int damage){
        Item added = new Item(name, type, value, damage);
        storeList.add(added);
    }
}
