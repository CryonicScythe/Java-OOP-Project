package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class QuadriaryController {

    @FXML
    Label outputLabel = new Label();

    @FXML
    Button nextButton = new Button();

    @FXML
    Button selectButton = new Button();

    @FXML
    Button leaveButton = new Button();

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primaryController");
    }
    
}
