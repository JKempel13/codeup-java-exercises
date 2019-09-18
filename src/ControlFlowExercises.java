

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*3. Display a table of powers.

        Prompt the user to enter an integer.
        Display a table of squares and cubes from 1 to the value entered.
        Ask if the user wants to continue.
        Assume that the user will enter valid data.
        Only continue if the user agrees to.*/

        System.out.println("What number would you like to go up to?");
        int num = Integer.parseInt(input.nextLine());
        System.out.println("Here is your table!");

        System.out.println("\nnumber | squared | cubed");
        System.out.println("------ | ------- | ----- ");


        for(int i = 1; i <= num; i++) {
            int j = i * i;
            int k = i * i * i;
            System.out.printf("%s      | %s       | %s     %n", i, j, k);
            if (i == 4) {
                System.out.println("Do you wish to continue?");
                String yesOrNo = input.nextLine();
                if (yesOrNo.equals("no")) {
                    break;
                } else {
                    continue;
                }
            }
        }

    }
}
