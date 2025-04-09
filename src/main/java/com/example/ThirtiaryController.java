package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ThirtiaryController {

    @FXML
    Label outpLabel = new Label();

    @FXML
    Button buyButton = new Button();

    @FXML
    Button sellButton = new Button();

    @FXML
    Button escapeButton = new Button();
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primaryController");
    }
}