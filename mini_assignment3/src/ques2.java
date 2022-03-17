
public class ques2 {
    public static boolean fun(String s1, String s2, String s3){
        if (s1.length()==0 && s2.length()==0 && s3.length()==0){
            return true;

        }
        if (s3.length()==0){
            return false;
        }
        if (s1.length()!=0 && s3.charAt(0)==s1.charAt(0)){
            return fun(s1.substring(1),s2,s3.substring(1));

        }
        if (s2.length()!=0 && s3.charAt(0)==s2.charAt(0)) {
            return fun(s1, s2.substring(1), s3.substring(1));
        }
        return false;
    }

    public static void main(String[] args){
        String s1="gid";
        String s2="Hash";
        String s3="Hgasidh";

        if(fun(s1,s2,s3)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
