package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    Button b1;
    @FXML
    Label txt1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txt1.setText("This is a txt");
    }

    public void b1_used(){
        txt1.setText("button_has_been_pressed");
    }

}
