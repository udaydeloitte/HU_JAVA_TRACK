package com.company;
import javax.sound.midi.Soundbank;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Emp. Age ");
        int age;
        age=sc.nextInt();
        if(age>18 && age<90) {
            String jdbcURL = "jdbc:mysql://localhost:3306/sampledbase";
            String username = "root";
            String password = "1234";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(jdbcURL, username, password);
                System.out.println("Connection Established Successfully");
                Statement st = connection.createStatement();




                System.out.println("Enter 1 For  Registration  2 For Login");
                int option = sc.nextInt();

                if (option == 1) {
                    Registration obj=new Registration();
                    obj.valid();

                /*    System.out.println("Enter Username: ");
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
                            if(Rage>18 && Rage<90){
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
                    }*/
                } else if (option == 2) {
                    LoginClass obj1=new LoginClass();
                    obj1.Logcls();
                    /*
                    System.out.println("Enter Username: ");
                    String varifyU = sc.next();
                    System.out.println("Enter Password: ");
                    String varifyP = sc.next();
                    String vsql = "select * from login where username='" + varifyU + "'";
                    //String vpsql="select * from login where password='" + varifyP + "'";
                    ResultSet vu = st.executeQuery(vsql);
                    //ResultSet vp=st.executeQuery(vpsql);
                    if (vu.next()) {
                        //if(vp.next()){
                        System.out.println("Login Successful");

                        //}
                        //else{
                        //  System.out.println("You are not registered");
                        //}

                    } else {
                        System.out.println("You are not registered");
                    }



                    while (true) {

                        //System.out.println("Menu : ");
                        System.out.println("Enter 1 to insert record");
                        System.out.println("Enter 2 to delete record");
                        System.out.println("Enter 3 to Exit");
                        System.out.println("Enter 4 to display all records");
                        System.out.println("Enter 5 to update records");

                        int choice = sc.nextInt();
                        if(choice==3){
                            break;
                        }
                        switch (choice) {
                            case 1:
                                System.out.println("Enter Username: ");
                                String runame = sc.next();
                                System.out.println("Enter Password: ");
                                String rpswd = sc.next();
                                System.out.println("Enter User ID");
                                int userid = sc.nextInt();
                                String sql="select * from login where userid='" + userid + "'";
                                ResultSet rc=st.executeQuery(sql);
                                if(rc.next()){
                                    System.out.println("Record Already exits");
                                    break;
                                }



                                System.out.println("Enter Age");
                                int Age = sc.nextInt();
                                if(Age>18 && Age<90){
                                    System.out.println("enter valid age");
                                    break;
                                }
                                System.out.println("Enter Company Name");
                                String cname = sc.next();
                                System.out.println("Enter Salary");
                                String salary = sc.next();
                                int i=Integer.parseInt(salary);
                                if(i<=0){
                                    System.out.println("Salary cant be 0 or less");
                                    break;
                                }
                                System.out.println("Enter Designation");
                                String desg = sc.next();
                                System.out.println("Enter Phone No.");
                                String phno = sc.next();
                                int cnt=0;


                                if(phno.length()==10){
                                    for(int j=0;j<phno.length();j++){
                                        if(!Character.isDigit(phno.charAt(j))){
                                            System.out.println("Invalid Phone no.");
                                            break;
                                        }
                                        cnt++;

                                    }
                                    if(cnt!=phno.length()){
                                        break;
                                    }
                                }
                                else {
                                    System.out.println("Invalid Phone number");
                                    break;
                                }
                                System.out.println("Enter Address");
                                String addr = sc.next();

                                st.executeUpdate("insert into login value('" + runame + "','" + rpswd + "','" + userid + "','" + Age + "','" + cname + "','" + salary + "','" + desg + "','" + phno + "','" + addr + "')");
                                System.out.println("USER DETAILS added successfully ");
                                break;
                            case 2:
                                System.out.println("Enter userID you want to delete: ");
                                int uid=sc.nextInt();
                                st.executeUpdate("delete from login where userid='"+uid+"'");
                                System.out.println("User Details Deleted Successfully");
                                break;
                            case 4:
                                ResultSet disp=st.executeQuery("select * from login");
                                System.out.println("username\\t\\password\\t\\userid\\t\\Age\\t\\company name\\t\\Salary\\t\\Designation\\t\\PhonrNo\\t\\Address");
                                System.out.println("***************************************************************************************************************************");
                                while (disp.next()){
                                    System.out.println(disp.getString(1)+"\t\t"+disp.getString(2)+"\t\t"+disp.getInt(3)+"\t\t"+disp.getInt(4)+"\t\t"+disp.getString(5)+"\t\t"+disp.getString(6)+"\t\t"+disp.getString(7)+"\t\t"+disp.getString(8)+"\t\t"+disp.getString(9));
                                }
                            case 5:
                                String update="update login set username=? where userid=?";
                                PreparedStatement st1= connection.prepareStatement(update);
                                System.out.println("Enter New Username");
                                String newusername=sc.next();
                                st1.setString(1,newusername);
                                System.out.println("Enter target userid");
                                int uuid=sc.nextInt();
                                st1.setInt(2,uuid);
                                st1.executeUpdate();
                                System.out.println("User details Updated successfully");
                        }
                    }*/
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("You cant register");
        }
    }
}

