package sample;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class register {

    load logins_loader = new load();
    private String login;
    private String password;

    public void sign_up(){

        try{

            FileWriter logins = new FileWriter("log.txt", true);
            BufferedWriter save_log = new BufferedWriter(logins);
            save_log.append(login);
            save_log.newLine();
            save_log.close();

            FileWriter passwords = new FileWriter("log.txt",true);
            BufferedWriter save_password = new BufferedWriter(passwords);
            save_password.append(password);
            save_password.newLine();
            save_password.close();

        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }

    }

    public void set_login(String txt_login){
        login = txt_login;
    }

    public void set_password(String txt_psw){
        password = txt_psw;
    }

}
