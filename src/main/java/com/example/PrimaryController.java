package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {
    @FXML
    Button startButton = new Button();

    @FXML
    Button storeButton = new Button();

    @FXML
    Button inventoryButton = new Button();
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondaryController");
    }

    @FXML
    private void switchToThirtiary() throws IOException {
        App.setRoot("thirtiaryController");
    }
}
