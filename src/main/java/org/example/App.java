package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String myPassword = "q13f4";

        //User Prompt
        System.out.print("What is the password? ");
        String password = scanner.next();

        //Condition and Display
        if(myPassword.contentEquals(password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("I don't know you");
        }
    }
}
