package sample;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import static java.lang.System.out;

public class load {
    File log = new File("log.txt");
    boolean exist = log.exists();

    public void login_load_write(){
        out.println("exist ? :" + exist);
    }
}

