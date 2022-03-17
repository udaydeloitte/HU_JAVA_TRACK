import java.util.*;
public class Reversing {
    public static void main(String[] args){
        List<String> words=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            words.add(sc.next());
        }
        System.out.println("Original: "+words);
        Collections.reverse(words);
        System.out.println("Reverse order"+words);


    }
}
