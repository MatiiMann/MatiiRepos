package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {

    @FXML
    Label txt1;

    public void ButtonSignIn(){
        System.out.println("Button is working");
        txt1.setText("Logging in successful");
    }

}
