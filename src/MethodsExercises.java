public class MethodsExercises {
    public static void main (String[] args){

//        System.out.println(sum(1, 12));
//        System.out.println(difference(83, 12));
//        System.out.println(multiply(4, 5));
//        System.out.println(division(7,2));
//        System.out.println(findTheRemainder(69,3));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

    }

// ==================EXERCISE 1==============================//
    public static int sum (int num1, int num2) {
        return num1 + num2;
    }

    public static int difference (int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply (int num1, int num2) {
        return num1 * num2;
    }

    public static double division (double num1, double num2) {
        return num1 / num2;
    }

    public static double findTheRemainder (double num1, int num2) {
        return num1 % num2;
    }

// =====================EXERCISE 2==========================//
    public static int getInteger(int min, int max){

    }
}

