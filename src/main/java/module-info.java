module app.web.pavelk.native_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.web.pavelk.native3 to javafx.fxml;
    exports app.web.pavelk.native3;
}