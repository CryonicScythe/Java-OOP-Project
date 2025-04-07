package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {
    Button startButton = new Button();
    Button storeButton = new Button();
    Button inventoryButton = new Button();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
