package com.company;
import javax.sound.midi.Soundbank;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.*;
public class Registration {
    public void valid(){
        String jdbcURL = "jdbc:mysql://localhost:3306/sampledbase";
        String username = "root";
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement st = connection.createStatement();
            System.out.println("Enter Username: ");
            String uname = sc.next();
            System.out.println("Enter Password: ");
            String pswd = sc.next();
            if (pswd.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*., ?]).+$") && ((pswd.length() > 5) && (pswd.length() < 10))) {
                System.out.println("Confirm Password: ");
                String confirm_pswd = sc.next();
                if (confirm_pswd.equals(pswd)) {

                    System.out.println("Enter User ID");
                    int useid = sc.nextInt();
                    System.out.println("Enter Age");
                    int Rage = sc.nextInt();
                    if(Rage<18 || Rage>90){
                        System.out.println("enter valid age");

                    }
                    System.out.println("Enter Company Name");
                    String Rcname = sc.next();
                    System.out.println("Enter Salary");
                    String Rsalary = sc.next();
                    int i=Integer.parseInt(Rsalary);
                    if(i<=0){
                        System.out.println("Salary cant be 0 or less than zero");

                    }
                    System.out.println("Enter Designation");
                    String Rdesg = sc.next();
                    System.out.println("Enter Phone No.");
                    String Rphno = sc.next();

                    int Rcnt=0;
                    int var=0;

                    if(Rphno.length()==10){
                        for(int j=0;j<Rphno.length();j++){
                            if(!Character.isDigit(Rphno.charAt(j))){
                                System.out.println("Invalid Phone no.");
                                var=1;
                            }
                            Rcnt++;

                        }
                        if(Rcnt!=Rphno.length()){
                            var=1;
                        }
                    }
                    else {
                        System.out.println("Invalid Phone number");
                        var=1;
                    }
                    System.out.println("Enter Address");
                    String Raddr = sc.next();
                    if (var==0) {
                        st.executeUpdate("insert into login value('" + uname + "','" + pswd + "','" + useid + "','" + Rage + "','" + Rcname + "','" + Rsalary + "','" + Rdesg + "','" + Rphno + "','" + Raddr + "')");


                        System.out.println("Registration Successful");
                    }
                }
            } else {
                System.out.println("Registration Unsuccessful");
            }
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();

        }
        catch (SQLException e){
            e.printStackTrace();

        }


    }
}
