import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        highLow(0, input);
    }

    public static int highLow(int num, Scanner input) {
        int randomNum = (int) Math.floor(Math.random() * 100 + 1);
        boolean found = false;

        while (!found) {
            System.out.println("Guess the number:");
            int guessedNumber = input.nextInt();

                if (guessedNumber > randomNum) {
                    System.out.println("LOWER!");
                } else if (guessedNumber < randomNum) {
                    System.out.println("HIGHER!");
                } else {
                    System.out.println("GOOD GUESS!");
                    found = true;
                }
        }
                return num;
    }
}

