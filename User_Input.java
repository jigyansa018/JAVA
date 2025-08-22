import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner class for input
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // Use nextLine() to capture the entire name, including spaces

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter your gender (M/F):");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your phone number:");
        long phno = sc.nextLong();

        System.out.println("...........................................");
        System.out.println("User Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phno);
        sc.close();
    }
}
