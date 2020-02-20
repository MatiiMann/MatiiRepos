package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public TextField username_log;
    @FXML
    public PasswordField password_log;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void button_sign_in(){
            System.out.println(username_log.getText());
            System.out.println(password_log.getText());
            System.out.println("is working");
    }

    @FXML TextField username_reg;
    @FXML PasswordField password_reg;
    @FXML PasswordField password2_reg;

    load logins_loader = new load();

    public void button_sign_up(){
        System.out.println(username_reg.getText());
        System.out.println(password_reg.getText());
        System.out.println(password2_reg.getText());
        logins_loader.login_load_write();
    }

}
