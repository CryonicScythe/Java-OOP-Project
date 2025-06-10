package com.example;

import java.io.IOException;
import java.util.ResourceBundle;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class QuadriaryController implements Initializable {

    int index = 0;
    public ItemCreater inventory = new ItemCreater();

    @FXML
    Label outputLabel = new Label();

    @FXML
    Button nextButton = new Button();

    @FXML
    Button selectButton = new Button();

    @FXML
    Button leaveButton = new Button();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        inventory.addItem("Gold Bar", "V", 5000);
        inventory.addItem("Steel Sword", "W", 800, 16);
        inventory.addItem("Potion", "B", 300);
    }

    // Returns to the main menu
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primaryController");
    }

    // Switches to the next item in the inventory list
    @FXML
    private void nextItem() throws IOException {
        index += 1;
        if (index > (inventory.bagList.size() - 1)) {
            index = 0;
        }

        Item selected = inventory.bagList.get(index);
        outputLabel.setText("Number of items in inventory: " + inventory.bagList.size() + "\n");
        outputLabel.setText(outputLabel.getText() + "Item placement: " + (index + 1) + "\n");
        outputLabel.setText(outputLabel.getText() + "Currently selected: " + selected.itemName() + "\n");
    }

    // Diplays the currently selected item in the inventory
    @FXML
    private void displayItem() throws IOException {
        Item selected = inventory.bagList.get(index);

        String outputName = "";
        String outputStats = "";

        outputName += selected.itemName();
        outputLabel.setTextFill(Color.GOLD);
        outputStats += "; Value: " + selected.itemValue();
        outputLabel.setTextFill(Color.BLACK);
        outputLabel.setText(outputLabel.getText() + outputName + outputStats + "\n");
    }
    
}
