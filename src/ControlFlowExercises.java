

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

do {
    System.out.println("Give me a grade number: ");
    int grade = Integer.parseInt(input.nextLine());

    String gradeLetter = "";
    if (grade <= 100 && grade >= 88) {
        gradeLetter = "A";
    } else if (grade <= 87 && grade >= 80) {
        gradeLetter = "B";
    } else if (grade <= 79 && grade >= 67) {
        gradeLetter = "C";
    } else if (grade <= 66 && grade >= 60) {
        gradeLetter = "D";
    } else if (grade <= 59 && grade >= 0) {
        gradeLetter = "F";
    }

    System.out.println(gradeLetter);
        System.out.println("Would you like to try another grade number? Y/N");
} while(input.nextLine().equalsIgnoreCase("y"));

        System.out.println("Ok, have a good day!");

    }
}
