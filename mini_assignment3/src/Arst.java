import java.util.Scanner;
public class Arst {
    public static void main(String[] args){
        int len;
        Scanner sc=new Scanner(System.in);
        len=sc.nextInt();
        int[] arr=new int[len];
        for (int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        int cnt=0;
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if (sum<0){
                    cnt++;
                }

            }
        }
        System.out.println();
        System.out.print(cnt);
    }

}
