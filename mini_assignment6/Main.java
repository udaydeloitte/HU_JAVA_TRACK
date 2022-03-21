package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
//parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("C:\\Users\\udayprsingh\\Documents\\FileHandling.csv"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());
            System.out.print(" ");//find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanne
    }
}

