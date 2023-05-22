package com.example.ejercicio5_sb;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ej5_Controller {
    static ToggleGroup radioGroup = new ToggleGroup();
    public Label n1;
    public Label n2;
    public Button operar;
    public TextField field1;
    public TextField field2;
    public RadioButton suma;
    public RadioButton mult;
    public RadioButton resta;
    public RadioButton div;
    public Label result;
    public TextField filed_result;
    public ButtonBar barra;

    public void oncalcular(ActionEvent actionEvent) {
        Double nu1, nu2, result;
        try {
            nu1 = Double.parseDouble(field1.getText());
            nu2 = Double.parseDouble(field2.getText());
            if (radioGroup.getSelectedToggle() == suma) {
                result = nu1 + nu2;
                filed_result.setText(result + "");
            } else if (radioGroup.getSelectedToggle() == resta) {
                result = nu1 - nu2;
                filed_result.setText(result + "");
            } else if (radioGroup.getSelectedToggle() == mult) {
                result = nu1 * nu2;
                filed_result.setText(result + "");
            } else if (radioGroup.getSelectedToggle() == div) {
                result = nu1 / nu2;
                filed_result.setText(result + "");
            } else {
                filed_result.setText("ERROR");
            }
        } catch (NumberFormatException e) {
            filed_result.setText("ERROR");
        }
    }

    public void initialize() {
        suma.setToggleGroup(radioGroup);
        resta.setToggleGroup(radioGroup);
        mult.setToggleGroup(radioGroup);
        div.setToggleGroup(radioGroup);

    }
}