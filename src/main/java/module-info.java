module com.example.cursedborders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cursedborders to javafx.fxml;
    exports com.example.cursedborders;
}