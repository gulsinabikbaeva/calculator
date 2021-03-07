module com.mycompany.calcolatrice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.calcolatrice to javafx.fxml;
    exports com.mycompany.calcolatrice;
}
