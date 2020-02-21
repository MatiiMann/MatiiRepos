package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private int pos;

    @FXML
    public TextField username_log;
    @FXML
    public PasswordField password_log;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML TextField username_reg;
    @FXML PasswordField password_reg;
    @FXML PasswordField password2_reg;

    load logins_loader = new load();

    public void button_sign_in(){
        logins_loader.login_load_write();   //load list of usernames
        logins_loader.password_load_write();    //load list of passwords

        String username = username_log.getText();   //give login from username field
        String password = password_log.getText();   //give psw form psw field
        int size = logins_loader.arr_long(); // give info how long is array
        //int pos;

        for(int i=0; i<size; i++){
            if(logins_loader.give_log(i).equals(username)){
                System.out.println("true " + username + " "  + i);
                pos =i;
            }
            break;
        }
        if (logins_loader.give_psw(pos).equals(password)) {
            System.out.println("password is correct");
        }

    }

    public void button_sign_up(){

    }

}
