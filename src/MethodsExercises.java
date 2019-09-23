import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(add(1, 12));
//        System.out.println(subtract(83.2, 12.9));
//        System.out.println(multiply(4, 5));
//        System.out.println(divide(7, 4));
//        System.out.println(findTheRemainder(69, 8));

//        int userNum = getInteger(1,10);

        //======= part of factorial method==========//
        /*String yesOrNo = "y";
        do {
            factorial(0, sc);
            System.out.println("Would you like to try another number? Y/N");
            yesOrNo = sc.nextLine();

        }while (yesOrNo.equalsIgnoreCase("Y"));*/

        String yesOrNo = "y";
        do {
            dice();
            diceGame(1, 6,sc);
            System.out.println("\nWould you like to try another number? Y/N");
            yesOrNo = sc.nextLine();

        }while (yesOrNo.equalsIgnoreCase("Y"));

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
    /*public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        if (sc.hasNextInt()) {
            int userInput = sc.nextInt();
            if (userInput >= min && userInput <=max) {
                return userInput;
            } else {
                System.out.println("invalid range");
            }
        } else {
          System.out.println("Invalid input");
        }
        return getInteger(min,max);
    }*/

    // =====================EXERCISE 3======================//
    /*public static long factorial(int num, Scanner sc) {

            int input = getInteger(1, 10);
            long Factorial = 1;
            for (int i = 1; i <= input; i++) {
                Factorial *= i;
            }
            System.out.printf("\n%d! = %d\n", input, Factorial);
            return Factorial;
        }*/

    // ===================EXERCISE 4=======================//
    public static void dice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many sides?");
        int sides = sc.nextInt();
    }

    public static int diceGame (int min, int max, Scanner sc) {
        Random diceRoll = new Random();
        System.out.println("Are you ready to roll the dice? Y/N");
        String roll = sc.nextLine();
        int die1=(int)(Math.random()*6+1);
        int die2=(int)(Math.random()*6+1);
        int sum= die1 + die2;

        System.out.printf("You rolled a %s and a %s", die1, die2);
        return sum;
    }
}

