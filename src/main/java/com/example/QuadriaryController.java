package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class QuadriaryController {

    int index = 0;

    ItemCreater.addItem("Gold Bar", "V", 5000);
    ItemCreater.addItem("Steel Sword", "W", 800, 16);
    ItemCreater.addItem("Potion", "B", 300);

    @FXML
    Label outputLabel = new Label();

    @FXML
    Button nextButton = new Button();

    @FXML
    Button selectButton = new Button();

    // Returns to the main menu
    @FXML
    Button leaveButton = new Button();

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primaryController");
    }

    @FXML
    private void nextItem() throws IOException {
        index += 1;
        if (index >= (ItemCreater.bagList.size() - 1)) {
            index = 0;
        }
    }

    @FXML
    private void displayItem() throws IOException {
        Item selected = ItemCreater.bagList.get(index);
        System.out.println(selected.itemName());
        System.out.println(selected.itemValue());
    }
    
}
