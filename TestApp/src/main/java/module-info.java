module com.example.testapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.example.testapp.Controller to javafx.fxml;
    opens com.example.testapp.Model to javafx.fxml;


    exports com.example.testapp;
    exports com.example.testapp.Controller;
    exports com.example.testapp.Model;


}