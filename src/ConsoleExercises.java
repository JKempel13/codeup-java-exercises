import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.\n", pi);
        //The value of pi is approximately 3.14.

//
        /*1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        What happens if you input something that is not an integer?*/

//       System.out.println("How old are you?");
//        int age = input.nextInt();
//        System.out.println("age = " + age);
//        System.out.println("You are " + age + " years old.");

        /*2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
                What happens if you enter less than 3 words?
                What happens if you enter more than 3 words?*/

//        System.out.println("Give me a word.");
//        String firstWord = input.next();
////        System.out.println(firstWord);
//        System.out.println("Give me a word.");
//        String secondWord = input.next();
////        System.out.println(secondWord);
//        System.out.println("Give me a word.");
//        String thirdWord = input.next();
////        System.out.println(thirdWord);
//
//        System.out.format("%s%n%s%n%s%n", firstWord,secondWord,thirdWord);

        /*3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        do you capture all of the words?
        4. Rewrite the above example using the nextLine method.*/

//        System.out.println("Give me a sentence.");
//        String sentence = input.next();
//        System.out.println(sentence);

        /*1. Prompt the user to enter values of length and width of a classroom at Codeup.
        Use the nextLine method to get user input and cast the resulting string to a numeric type.
        - Assume that the rooms are perfect rectangles.
        - Assume that the user will enter valid numeric data for length and width.*/

        System.out.println("What is the length of the classroom?(in feet)");
        int roomLength = Integer.parseInt(input.nextLine());

        System.out.println("What is the width of the classroom?(in feet)");
        int roomWidth = Integer.parseInt(input.nextLine());

        System.out.println("What is the height of the classroom?(in feet)");
        int roomHeight = Integer.parseInt(input.nextLine());

        int area = roomLength * roomWidth;
        int perimeter = ((roomLength * 2) + (roomWidth * 2));
        int volume = ((roomLength * 2) + (roomWidth * 2) + (roomHeight * 2));

// ============== BONUS ======================
//        double lengthNum = Double.parseDouble(roomLength);
//        double widthNum = Double.parseDouble(roomWidth);
//        double heightNum = Integer.parseInt(roomHeight);
//        double area = lengthNum * widthNum;
//        double perimeter = ((lengthNum * 2) + (widthNum * 2));
//        double volume = ((lengthNum * 2) + (widthNum * 2) + (heightNum * 2));

        System.out.println("The area of the classroom is: " + area + " sq ft");
        System.out.println("The perimeter of the classroom is: " + perimeter + " ft");
        System.out.println("The volume of the classroom is: " + volume + " ft");
    }
}
