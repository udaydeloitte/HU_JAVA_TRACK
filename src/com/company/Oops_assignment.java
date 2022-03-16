package com.company;
import java.util.Scanner;
public class Oops_assignment {

    public static void Main(String[] args) {
        AreaC a = new AreaC();
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius=r.nextDouble();
        a.circle(radius);
        System.out.print("Enter Side: ");
        int side=r.nextInt();

        a.square(side);
        System.out.print("Enter length: ");
        int length=r.nextInt();
        System.out.print("Enter Width: ");
        int width=r.nextInt();
        a.rectangle(length,width);
        System.out.print("Enter height: ");
        int height=r.nextInt();
        System.out.print("Enter base: ");
        int base=r.nextInt();

        a.triangle(height,base);
        Animal b= new Animal();
        b.fun();

	// write your code here
    }
}
