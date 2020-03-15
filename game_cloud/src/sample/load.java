package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class load {

    private ArrayList arr_log = new ArrayList();
    private String login;

    private ArrayList arr_psw = new ArrayList();
    private String password;

    public void logins_loader (){
        try{
            File log = new File("log.txt");
            Scanner l = new Scanner(log);

            while (l.hasNext()){
                login = l.nextLine();
                arr_log.add(login);
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

    public void passwords_loader(){
        try{
            File psw = new File("psw.txt");
            Scanner p = new Scanner(psw);

            while(p.hasNext()){
                password=p.nextLine();
                arr_psw.add(password);
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

    public int give_l_size(){
        return arr_log.size();
    }

    public String give_login(int i){
        return arr_log.get(i).toString();
    }

    public String give_password(int i){
        return  arr_psw.get(i).toString();
    }

}
