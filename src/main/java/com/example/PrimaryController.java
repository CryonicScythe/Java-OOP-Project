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
    
    // Switches to the battle page
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondaryController");
    }

    // Switches to the store page
    @FXML
    private void switchToThirtiary() throws IOException {
        App.setRoot("thirtiaryController");
    }

    // Switches to the inventory page
    @FXML
    private void switchToQuadriary() throws IOException {
        App.setRoot("quadriaryController");
    }
}
