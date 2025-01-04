import java.util.Scanner;
public class Demo8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String loginid;
        String pwd;
        string reply;
        do{
            System.out.println("Welcome to malla reddy university");
            System.out.println("Have you visited site earlier");
            String reply = sc.nextLine();
            if(reply == "no"){
                System.out.println("login here");
                System.out.println("enter ur id and pwd");
                 String loginid = sc.nextLine();
                 String pwd = sc.nextLine();
            } else
            System.out.println("your are our valued customer");
        }while((loginid == 'bhavya') && (pwd == "user001"));
            }
        }
    
