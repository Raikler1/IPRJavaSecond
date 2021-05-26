package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile(args[0]);
        for (int i = 1; i <=5 ; i++) {
            File file = new File(args[1]+i);
            FileWriter fw = new FileWriter(args[2]+i);
            Scanner buff = new Scanner(new FileReader(file));
            while (buff.hasNextLine()){
                if(buff.findInLine(pattern)!=null)
                fw.write(buff.findInLine(pattern)+"\n");
                buff.nextLine();
            }
        }
    }
}
