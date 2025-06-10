package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ThirtiaryController extends QuadriaryController {

    StoreCreator shelf = new StoreCreator();
    int index = 0;
    int money = 4000;

    @FXML
    Label outputLabel = new Label();

    @FXML
    Button buyButton = new Button();

    @FXML
    Button sellButton = new Button();

    @FXML
    Button escapeButton = new Button();
    
    // Returns to the main menu
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primaryController");
    }

    // Adds items into the store
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        shelf.storeItem("Wooden Staff", "W", 1300, 19);
        shelf.storeItem("Tungsten Broadsword", "W", 1600, 26);
        shelf.storeItem("Tome of Blinding", "W", 2000, 5);
    }

    // Adds the item to the inventory if money is sufficient
    @FXML
    public void buyItem() throws IOException {
        Item bought = shelf.storeList.get(index);
        if (money < bought.itemValue())
        {
            outputLabel.setText(outputLabel.getText() + "Come back when you're a little... RICHer" + "\n");
        }
        else {
            inventory.addItem(bought.itemName(), bought.itemType(), bought.itemValue(), bought.itemDamage());
            money -= bought.itemValue();
            outputLabel.setText(outputLabel.getText() + "* Bought the " + bought.itemName() + "\n");
        }
        outputLabel.setText(outputLabel.getText() + "Current money: " + money + "\n");
        System.out.println(inventory.bagList.size());
    }

    // Displays the store and selects the next item on the store list
    @FXML
    public void nextItem() throws IOException {
        index += 1;
        if (index > (shelf.storeList.size() - 1)) {
            index = 0;
        }
        Item selected = shelf.storeList.get(index);

        outputLabel.setText("");
        for (int i = 1; i <= shelf.storeList.size(); i++) {
            Item purchasable = shelf.storeList.get(i - 1);
            outputLabel.setText(outputLabel.getText() + "$" + purchasable.itemValue() + ". " + purchasable.itemName() + "\n");
        }
        outputLabel.setText(outputLabel.getText() + "Currently selected: " + selected.itemName() + "\n");
    }


}