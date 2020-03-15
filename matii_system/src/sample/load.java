package sample;

import javafx.scene.chart.ScatterChart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import static java.lang.System.out;

public class load  {

        public ArrayList log_list = new ArrayList();
        public String login;
        public int position = 0;

        public  ArrayList psw_list = new ArrayList();
        public String psw_load;
        public int position2 =0;

    public void password_load_write(){
        try{
            File psw = new File("psw.txt");
            Scanner p = new Scanner(psw);

            while(p.hasNextLine()){
                psw_load = p.nextLine();
                psw_list.add(psw_load);
               // System.out.println(psw_load + " " + position2);
                position2 = position2 + 1;
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }

    public void login_load_write(){

        try{
            File log = new File("log.txt");
            boolean exist = log.exists();
            Scanner l = new Scanner(log);

            while (l.hasNextLine()){
                login = l.nextLine();
                log_list.add(login);
               // System.out.println(login+ " " + position);
                position=position+1;

            }

        }catch(FileNotFoundException e){

            System.out.println("File doesn't exist");

        }
    }

    public int arr_long(){
        return log_list.size();
    }

    public String give_log(int x){
        return log_list.get(x).toString();
    }

    public String give_psw(int x){
        return psw_list.get(x).toString();
    }

    public void add_to_logins(String login_atl){
        log_list.add(login_atl);
    }

    public void add_to_passwords(String psw_atp){
        psw_list.add(psw_atp);
    }
}

