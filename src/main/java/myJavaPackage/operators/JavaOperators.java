package myJavaPackage.operators;

import java.util.Scanner;

public class JavaOperators {

    /*
     Java has several types of operators:

     1. Arithmetic Operators: +, -, *, /
     2. Comparison / Relational Operators: <, >, <=, >=, ==, !=
     3. Logical Operators: AND (&&), OR (||)
     4. Assignment Operator: =
    */

    public void arithmeticOperators() {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = obj.nextInt();

        System.out.print("Enter second number (b): ");
        int b = obj.nextInt();

        int result = a - b;

        if (result > 0) {
            System.out.println("a is greater than b. The result is: " + result);
        } else {
            System.out.println("Sorry, a is not greater than b. The result is: " + result);
        }
    }

    public void comparisonOpt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else if (age == 17) {
            System.out.println("You cannot vote. You are 17.");
        } else {
            System.out.println("You cannot vote.");
        }
    }

    public void logicalOperator() {
        int a = 20;
        int b = 9;
        int c = 5;

        boolean result = (a > b) && (b < c);
        System.out.println("Result of (a > b) && (b < c): " + result);

        result = (a == b) || (a > c);
        System.out.println("Result of (a == b) || (a > c): " + result);
    }

    public static void main(String[] args) {
        JavaOperators obj = new JavaOperators();
        obj.arithmeticOperators();
        obj.comparisonOpt();
        obj.logicalOperator();
    }
}
