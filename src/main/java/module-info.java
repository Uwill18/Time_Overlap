module com.example.time_overlap {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.time_overlap to javafx.fxml;
    exports com.example.time_overlap;
}