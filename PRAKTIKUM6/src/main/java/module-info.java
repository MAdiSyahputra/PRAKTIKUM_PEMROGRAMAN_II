module adi.praktikum6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens adi.praktikum6 to javafx.fxml;
    exports adi.praktikum6;
}