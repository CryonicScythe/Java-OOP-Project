package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    Label outputLabel = new Label();

    @FXML
    Button fightButton = new Button();

    // Returns to the main menu
    @FXML
    Button escapeButton = new Button();

    @FXML
    Button inventoryButton = new Button();
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primaryController");
    }
}