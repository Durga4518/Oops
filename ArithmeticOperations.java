import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double result = 0;

        if (choice == 1) {
            result = num1 + num2;
            System.out.println("Sum: " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("Difference: " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("Product: " + result);
        } else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Error: Division by zero");
            } else {
                result = num1 / num2;
                System.out.println("Quotient: " + result);
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
}
