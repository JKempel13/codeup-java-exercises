import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        highLow(0);
    }
    public static double highLow (int num){
        double randomNum = (int) Math.floor(Math.random() * 100 +1);
        System.out.println(randomNum);
        System.out.println("Guess the number:");

        return randomNum;
    }
}
