import java.util.Scanner;
public class Pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        for (int i=1;i<=val;i++){
            for (int j=val-1;j>=i;j--){
                System.out.print(" ");



            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i=val-1;i>=1;i--){
            for (int k=val;k>i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
