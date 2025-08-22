import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        System.out.println("Select Symbol (+, -, *, /):");
        String s = sc.next();

        int res; // Declare the result variable
        switch (s) {
            case "+":
                res = num1 + num2;
                System.out.println("Addition is: " + res);
                break;

            case "-":
                res = num1 - num2;
                System.out.println("Subtraction is: " + res);
                break;

            case "*":
                res = num1 * num2;
                System.out.println("Multiplication is: " + res);
                break;

            case "/":
                if (num2 != 0) { // Check for division by zero
                    res = num1 / num2;
                    System.out.println("Division is: " + res);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Symbol");
                break;
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
