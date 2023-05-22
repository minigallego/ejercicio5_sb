module com.example.ejercicio5_sb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejercicio5_sb to javafx.fxml;
    exports com.example.ejercicio5_sb;
}