package com.example;

import java.io.IOException;
import java.util.ResourceBundle;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class QuadriaryController implements Initializable {

    int index = 0;
    ItemCreater inventory = new ItemCreater();

    @FXML
    Label outputLabel = new Label();

    @FXML
    Button nextButton = new Button();

    @FXML
    Button selectButton = new Button();

    // Returns to the main menu
    @FXML
    Button leaveButton = new Button();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        inventory.addItem("Gold Bar", "V", 5000);
        inventory.addItem("Steel Sword", "W", 800, 16);
        inventory.addItem("Potion", "B", 300);
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primaryController");
    }

    @FXML
    private void nextItem() throws IOException {
        index += 1;
        if (index >= (inventory.bagList.size() - 1)) {
            index = 0;
        }

        Item selected = inventory.bagList.get(index);
        outputLabel.setText(outputLabel.getText() + "Currently selected: " + selected.itemName() + "\n");
    }

    @FXML
    private void displayItem() throws IOException {
        Item selected = inventory.bagList.get(index);

        String output = "";
        output += selected.itemName() + selected.itemValue();
        outputLabel.setText(outputLabel.getText() + output + "\n");
    }
    
}
