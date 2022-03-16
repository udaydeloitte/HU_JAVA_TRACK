package com.company;
import java.util.Scanner;
public class AreaC {
    public void circle(double radius){

        double ans= Math.PI*radius*radius;
        System.out.println("Circle Area is ");
        System.out.println(ans);

    }
    public void square(int side){
        int ans = side*side;
        System.out.println("Square Area");
        System.out.println(ans);
    }
    public void rectangle(int length,int width){
        System.out.println("Rectangle Area");
        int ans = length*width;
        System.out.println(ans);

    }
    public void triangle(int height,int base){
        System.out.println("triangle Area");

        int ans = (height*base)/2;
        System.out.println(ans);

    }
}
