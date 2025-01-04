import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = "";
        String pwd = "";
        String reply;

        do {
            System.out.println("Welcome to Malla Reddy University");
            System.out.println("Have you visited the site earlier?");
            reply = sc.nextLine();

            if (reply.equals("no")) {
                System.out.println("Login here");
                System.out.println("Enter your id and password");
                loginid = sc.nextLine();
                pwd = sc.nextLine();
            } else {
                System.out.println("You are our valued customer");
            }
        } while (!(loginid.equals("bhavya") && pwd.equals("user001")));

        System.out.println("Login successful!");
    }
}
