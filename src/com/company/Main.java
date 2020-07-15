package com.company;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a limit: ");
        int limit = scanner.nextInt();

        System.out.print("Enter a fizz: ");
        int fizz = scanner.nextInt();

        System.out.print("Enter a buzz: ");
        int buzz = scanner.nextInt();


        for(int i = 0; i <= limit; i++){

            String output;

            if (i % (fizz * buzz) == 0){
                output = "Fizz and Buzz";
            }else if (i % fizz == 0){
                output = "Fizz";
            }else if (i % buzz == 0){
                output = "Buzz";
            }else {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }
    }
}
