package com.sparta.grr;

import java.io.*;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("src/main/resources/employees.csv"));

            bufferedReader.readLine();
            //bufferedReader.lines().skip(1);

            Serializable line = bufferedReader.readLine();
            int count = 0;
            while(line != null){
                count++;
                System.out.println(line + " \ncount: "+ count);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        try {
//            BufferedReader bufferedReader = new BufferedReader(
//                    new FileReader("src/main/emplfoyees.csv"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println(e.getClass());
//        } finally {
//            System.out.println("I always run");
//        }

    }
}
