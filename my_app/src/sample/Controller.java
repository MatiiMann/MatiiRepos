package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.awt.*;

public class Controller {

    @FXML Label txt1;
    @FXML PasswordField pssw;

    public void ButtonSignIn(){
        System.out.println("Button is working");
        txt1.setText("Logging in successful");
        System.out.println(pssw.getText());

    }

}
