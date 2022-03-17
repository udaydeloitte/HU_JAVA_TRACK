import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        String s1=n.nextLine();
        String s2=n.nextLine();
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)){
            System.out.println("True");
        }
        else{
            System.out.print("False");
        }


    }
}
