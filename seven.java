import java.util.*;
public class seven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean cond = true;

        while (cond == true) {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char choice = sc.next().charAt(0);

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            if (choice == '+') {
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
            }
            else if (choice == '-') {
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
            }
            else if (choice == '*') {
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
            }
            else if (choice == '/') {
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
            }
            else {
                System.out.println("Invalid operator. Please use +, -, *, or /");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String ch = sc.next();

            if (ch.equalsIgnoreCase("no") || ch.equalsIgnoreCase("n")) {
                cond = false;
            }
        }

        System.out.println("Calculator exited.");

    }
}