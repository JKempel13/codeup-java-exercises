import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*2. Fizzbuzz

        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

                Write a program that prints the numbers from 1 to 100.
        For multiples of three: print “Fizz” instead of the number.
        For the multiples of five: print “Buzz”.
        For numbers which are multiples of both three and five: print “FizzBuzz”.*/

            for (int num = 1; num <= 100; num++) {
                if (((num % 3) == 0) & ((num % 5) == 0)){
                    System.out.println("FizzBuzz");
                } else if (num % 3 == 0){
                    System.out.println("Fizz");
                } else if (num % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(num);
                }
            }

    }
}
