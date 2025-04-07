module oop_project {
    requires javafx.controls;
    requires javafx.fxml;

    opens oop_project to javafx.fxml;
    exports oop_project;
}
