package com.example.tahminoyunu;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {

    @FXML
    public TextField txt;
    @FXML
    public Label lbl;
    Random r = new Random();
    int rast=r.nextInt(100), tahmin=-1, sayac=0;


    @FXML
    protected void onHelloButtonClick() {
            tahmin = Integer.parseInt(txt.getText());
            sayac++;
            if(tahmin==rast) {
                lbl.setText("Tebrikler "+ sayac + " denemede bildiniz!");

            }else if(tahmin>rast){
                lbl.setText("Daha küçük! "+sayac+ ". deneme");
            } else if(tahmin<rast){
                lbl.setText("Daha büyük! "+sayac+ ". deneme");
            }
    }
}