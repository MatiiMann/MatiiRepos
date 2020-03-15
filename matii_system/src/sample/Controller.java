package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private int pos;

    @FXML
    public TextField username_log;
    @FXML
    public PasswordField password_log;
    @FXML Pane pane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        logins_loader.login_load_write();   //load list of usernames
        logins_loader.password_load_write();    //load list of passwords
        pane.setVisible(false);
    }

    @FXML TextField username_reg;
    @FXML PasswordField password_reg;
    @FXML PasswordField password2_reg;
    @FXML Label error_reg;
    @FXML Label error_log;

    load logins_loader = new load();
    register register = new register();

    public void button_sign_in(){

        String username = username_log.getText();   //give login from username field
        String password = password_log.getText();   //give psw form psw field
        int size = logins_loader.arr_long(); // give info how long is array

        for(int i=0; i<size; i++){
            if(logins_loader.give_log(i).equals(username)){
                System.out.println("true " + username + " "  + i);
                pos =i;
                if (logins_loader.give_psw(pos).equals(password)) {
                    System.out.println("password is correct");
                    error_log.setTextFill(Color.GREEN);
                    error_log.setText("Logging has been completed");
                    pane.setVisible(false);
                }else{
                    error_log.setTextFill(Color.RED);
                    error_log.setText("Wrong password");
                }
                break;
            }else{
                error_log.setTextFill(Color.GREEN);
                error_log.setText("Login is wrong");
            }
        }

    }

    public void button_sign_up() {

        boolean flag = false;

        if (username_reg.getText().equals("") || password_reg.getText().equals("") || password2_reg.getText().equals("")) {
            System.out.println("All fields have to be used");
            error_reg.setTextFill(Color.RED);
            error_reg.setText("All fields have to be used");
        } else {
            for (int i = 0; i < logins_loader.arr_long(); i++) {
                if (logins_loader.give_log(i).equals(username_reg.getText())) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                if (password_reg.getText().equals(password2_reg.getText())) {
                    register.set_username(username_reg.getText());
                    register.set_password(password_reg.getText());
                    register.sign_up();
                    error_reg.setTextFill(Color.GREEN);
                    error_reg.setText("Registeration has been completed");
                } else {
                    System.out.println("passwords are differ");
                    error_reg.setTextFill(Color.RED);
                    error_reg.setText("Passwords are differ");
                }
            } else {
                System.out.println(flag);
                System.out.println("username is used");
                error_reg.setTextFill(Color.RED);
                error_reg.setText("This username is used by other user");
            }
        }
    }
}
