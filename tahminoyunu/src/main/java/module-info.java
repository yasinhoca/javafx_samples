module com.example.tahminoyunu {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.tahminoyunu to javafx.fxml;
    exports com.example.tahminoyunu;
}