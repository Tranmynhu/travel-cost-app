module org.example.travelcostapp2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.travelcostapp2 to javafx.fxml;
    exports org.example.travelcostapp2;
}