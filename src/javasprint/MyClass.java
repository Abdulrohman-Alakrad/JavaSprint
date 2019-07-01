package javasprint;
//import java.util.*; 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyClass {

    public void printMsg(String mess) {
        System.out.println(mess);
    }

    public void guessMyNumber() throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        int num = Integer.parseInt(in.readLine());
          Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
          int num = input.nextInt();
//            int count = 0;
//            int num = Integer.parseInt(in.readLine());
            if (num >= 0 && num <= 10) {
//                int lower = 0;
//                int higher = 11;
//                int random = (int) (Math.random() * (higher - lower)) + lower;
                int random = (int) (Math.random() * 11) + 1;
                if (num == random) {
                    System.out.println("Congratulation!! You win!!");
//                    out.write(" Congratulation!! You win!! ");
                    break;
                } else {
                System.out.println("try again");
//                    out.write(" Try again ");
                }
            } else {
                System.out.println("Choose a number between 0 and 10");
//                out.write(" Try again ");
            }
        }
        System.out.println("Game Over ");
//        out.write(" Game Over ");
//        out.flush();
    }

    public static void main(String[] args) throws IOException {
        MyClass instance = new MyClass();
        
        instance.printMsg("Hi there!");
        instance.guessMyNumber();
    }
}
