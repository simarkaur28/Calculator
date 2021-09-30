package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    //private Button Add,Subtract;

    @FXML
    private TextField number1,number2,ans;

    @FXML
    protected void onADDButtonClick() {
        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first + second;
        ans.setText(String.valueOf(result));
    }
    @FXML
    protected void onSubtractButtonClick() {

        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first - second;
        ans.setText(String.valueOf(result));
    }
}
