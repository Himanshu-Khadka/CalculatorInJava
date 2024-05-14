module himanshukhadka.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens himanshukhadka.calculator to javafx.fxml;
    exports himanshukhadka.calculator;
}