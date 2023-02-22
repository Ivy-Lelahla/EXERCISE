package com.mycompany.exerciseone;

import java.io.IOException;
import static javafx.beans.binding.Bindings.add;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
       @FXML
    private TextField enterNumber;

    
    @FXML
    private Button Decrease;

    @FXML
    private Button Increase;
    int Number;
    int i;
    int add;
    int subtract;

    @FXML
    void decreaseButton(ActionEvent event) {
           // for(int i=0; i<String.valueOf(Number).length(); i--){
            Number=Number - add;
             add=Integer.parseInt(enterNumber.getText());
            enterNumber.setText(String.valueOf(Number));
            --Number;
        //}
    }

    @FXML
    void increaseButton(ActionEvent event) {
                for(int i=0; i<String.valueOf(Number).length(); i++){
            Number=Number + add;
             add=Integer.parseInt(enterNumber.getText());
            enterNumber.setText(String.valueOf(Number));
            ++Number;
        }
  

    }


    @FXML
    private void switchToSecondary() throws IOException {
       
        App.setRoot("secondary");
    }
}
