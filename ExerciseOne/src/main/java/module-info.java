module com.mycompany.exerciseone {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.exerciseone to javafx.fxml;
    exports com.mycompany.exerciseone;
}
