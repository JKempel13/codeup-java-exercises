import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* While
        Create an integer variable i with a value of 5.
        Create a while loop that runs so long as i is less than or equal to 15
        Each loop iteration, output the current value of i, then increment i by one.*/

//       int i = 5;
//       while(i <= 15){
////           System.out.println(i++);
//       }

        /*Do While
        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        Alter your loop to count backwards by 5's from 100 to -10.
        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:*/

//        byte count = 0;

//        do {
////            System.out.println(count += 2);
//        } while(count < 100);

//        byte backwardsCount = 100;
//
//        do {
//            System.out.println(backwardsCount);
//            backwardsCount -= 5;
//        } while(backwardsCount >= -10);

//        long newCount = 2;
//        do {
//            System.out.println(newCount);
//            newCount *= newCount;
//        } while(newCount <= 1000000);

        /*For
        Refactor the previous two exercises to use a for loop instead.*/

        for (byte bC = 100; bC >= -10; bC -= 5){
            System.out.println(bC);
        }

        for (long nC = 2; nC <= 1000000; nC *= nC) {
            System.out.println(nC);
        }
    }
}
