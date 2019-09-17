import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
////        System.out.format("The value of pi is approximately %s.", pi);
//        //The value of pi is approximately 3.14.
//
        Scanner input = new Scanner(System.in);
//
////        System.out.println("How old are you?");
//        int userInput = input.nextInt();

//        System.out.println("You are " + userInput + " years old.");

        System.out.println("Give me a 3 word sentence.");
        String firstWord = input.next();
        System.out.println(firstWord);
        String secondWord = input.next();
        System.out.println(secondWord);
        String thirdWord = input.next();
        System.out.println(thirdWord);
    }
}
