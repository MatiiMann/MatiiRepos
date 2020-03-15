package sample;

import java.io.*;
import java.io.Writer;
import java.nio.Buffer;
import java.util.ArrayList;

public class register {

    load logins_loader = new load();
    private String username;
    private String password;

    public void set_username(String txt_login){
        username = txt_login;
    }

    public void set_password(String txt_psw){
        password = txt_psw;
    }

    public void sign_up(){

        try{

            FileWriter logins = new FileWriter("log.txt", true);
            BufferedWriter save_log = new BufferedWriter(logins);
            save_log.append(username);
            save_log.newLine();
            save_log.close();

            FileWriter passwords = new FileWriter("psw.txt", true);
            BufferedWriter save_password = new BufferedWriter(passwords);
            save_password.append(password);
            save_password.newLine();
            save_password.close();

        }catch(FileNotFoundException e) {
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }

    }
}
