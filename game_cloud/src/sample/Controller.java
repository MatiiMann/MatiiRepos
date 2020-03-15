package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sun.plugin2.main.client.MessagePassingOneWayJSObject;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //elements from login section
    @FXML
    TextField login_l;
    @FXML

    PasswordField password_l;
    //elements from reg section
    @FXML
    TextField login_r;
    @FXML
    PasswordField password_r1;
    @FXML
    PasswordField password_r2;

    load l = new load();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        l.logins_loader();
        l.passwords_loader();
    }

    public void sign_in_b_used(){
        String login=login_l.getText();
        String password=password_l.getText();
        int list_size = l.give_l_size();
        int position=0;
        boolean flag = false;

        for(int i=0;i<list_size;i++){
            if(login.equals(l.give_login(i))){
                flag =true;
                position = i;
                break;
            }
        }

        if(flag==true){
            if(password.equals(l.give_password(position))){
                System.out.println("Logging successfull");
            }
        }else{
            System.out.println("Wrong password or login");
        }
    }

    public void sign_up_b_used(){
        System.out.println(login_r.getText());
        System.out.println(password_r1.getText());
        System.out.println(password_r2.getText());
    }

}
