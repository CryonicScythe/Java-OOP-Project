package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ThirtiaryController {

    StoreCreator inventory = new StoreCreator();

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

    @FXML
    private void printStore() throws IOException {
        for (int i = 1; i <= inventory.storeList.size(); i++) {
            Item purchasable = inventory.storeList.get(i - 1);
            outputLabel.setText(outputLabel.getText() + i + ". " + purchasable.itemName() + "\n");
        }
    }

}