package com.test.codingtest01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        try {
            OutputStream output = new FileOutputStream("C:\\test.txt");
            Scanner sc = new Scanner(System.in);
            String[] arr = {"1", "2", "3", "4", "5"};
            String str = "";
            String userInput = sc.nextLine().replaceAll(" ", "");
            for(int i=0; i<arr.length; i++){
                str += arr[i] + " ";
                if (arr[i].equals(userInput)){
                    userInput = "";
                }
            }
            str += userInput;
            byte[] by = str.getBytes();
            output.write(by);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

