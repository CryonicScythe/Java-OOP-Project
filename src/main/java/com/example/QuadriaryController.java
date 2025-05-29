package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class QuadriaryController {

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
    
}
