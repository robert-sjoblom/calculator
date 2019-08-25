package se.ec.robert;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApplication {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            char operator = '0';
            double num1 = 0;
            double num2 = 0;

            try {
                System.out.println("Enter the first number please: ");
                num1 = sc.nextDouble();
                System.out.println("Enter the second number please: ");
                num2 = sc.nextDouble();
                System.out.println("Enter operation (q to quit): ");
                operator = sc.next().charAt(0);

                if (operator == 'q') break;

                Calculator calculator = new Calculator();
                double result = calculator.makeCalculation(num1, num2, operator);
                System.out.println("Result is: " + result);

            } catch (InputMismatchException exception) {
                System.out.println("That's not a great input, bub.");
                sc.nextLine();
                continue;
            }
        } while (true);
    }
}
