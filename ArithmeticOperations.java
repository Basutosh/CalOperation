import java.util.*;
public class ArithmeticOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public float divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (float) a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticOperations operations = new ArithmeticOperations();
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition: " + operations.add(num1, num2));
        System.out.println("Subtraction: " + operations.subtract(num1, num2));
        System.out.println("Multiplication: " + operations.multiply(num1, num2));
        System.out.println("Division: " + operations.divide(num1, num2));

        sc.close();
    }
}
