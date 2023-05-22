package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Newview {

    @FXML
    private Button btn;

    @FXML
    private TextField txt;


    @FXML
    protected void textal(){
        btn.setText(txt.getText());

    }
}
