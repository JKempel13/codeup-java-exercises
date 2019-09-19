import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(add(1, 12));
//        System.out.println(subtract(83.2, 12.9));
//        System.out.println(multiply(4, 5));
//        System.out.println(divide(7, 4));
//        System.out.println(findTheRemainder(69, 8));

        getInteger(1,10);
    }

    // ==================EXERCISE 1==============================//
   /* public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double findTheRemainder(double num1, int num2) {
        return num1 % num2;
    }*/

    // =====================EXERCISE 2==========================//
    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <=max) {
            System.out.println("Valid number entered");
            return userInput;
        } else {
            System.out.println("invalid number");
            return getInteger(min, max);
        }

    }
}