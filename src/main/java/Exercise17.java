/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        double gender;
        double A;
        double W;
        double H;

        Scanner scan = new Scanner(System.in); //Double scanner.
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        gender = scan.nextDouble();
        System.out.print("How many ounces of alcohol did you have? ");
        A = scan.nextDouble();
        System.out.print("What is your weight, in pounds? ");
        W = scan.nextDouble();
        System.out.print("How many hours has it been since your last drink? ");
        H = scan.nextDouble();

        double r; //Alcohol distribution ratio.
        if(gender==1) {
            r = 0.73; //Male.
        }
        else {
            r = 0.66; //Female.
        }

        double BAC;
        BAC=A*5.14/W*r-0.015*H;

        System.out.println("Your BAC is " + BAC);

        if(BAC <= 0.08) {
            System.out.println("It is legal for you to drive.");
        }
        else {
            System.out.println("It is not legal for you to drive.");
        }

    }
}


