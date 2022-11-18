module com.example.dyrehandel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dyrehandel to javafx.fxml;
    exports com.example.dyrehandel;
}