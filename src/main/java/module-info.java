module fr.miage.toulouse.ProjetL3 {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires java.desktop;
	requires javafx.graphics;
    requires java.base;

    opens fr.miage.toulouse.ProjetL3 to javafx.fxml;
    opens fr.miage.toulouse.ProjetL3.controleur to javafx.fxml;
    exports fr.miage.toulouse.ProjetL3;
}