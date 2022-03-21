import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionCode {
    public static void main(String args[]){
        int a,b;
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();


        //Enter b=0
        try{
            int c=a/b;
            System.out.println("Ans"+c);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Found, cant divide with zero");
        }
        finally {
            System.out.println("Thank you");
        }


    }
}
