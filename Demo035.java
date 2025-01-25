import java.util.Scanner;

public class Demo035 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b= scanner.nextInt();

        if (a > b) {
            System.out.println(a + " is the bigger number.");
        } else if (a > b) {
            System.out.println(b + " is the bigger number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
