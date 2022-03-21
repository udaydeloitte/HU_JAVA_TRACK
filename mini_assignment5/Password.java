import java.util.Scanner;
import java.util.regex.*;
public class Password {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String p=sc.next();

        try{
            if (p.length()>5 && p.length()<10) {
                System.out.println("Valid");
                try{
                    if (p.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).*$")){
                        System.out.println("Valid");
                    }
                }
                catch (ArithmeticException e){
                    System.out.println("Not valid");
                }
            }



        }
        catch (ArithmeticException e){
            System.out.println("Not valid");
        }
    }
}
