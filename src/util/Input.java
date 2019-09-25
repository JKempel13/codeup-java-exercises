package util;


import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("enter a string");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Y/N");
        String input = scanner.nextLine();

        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {

        int input;

        do {
            System.out.println("enter an integer between" + min + "and" + max);
            input = scanner.nextInt();
        } while(input <= min || input >= max);

        return input;
    }

    public int getInt() {
        System.out.println("enter an integer again");
        return scanner.nextInt();
    }

    public double getDouble (double min, double max) {
        double input;

        do {
            System.out.println("enter an integer between" + min + "and" + max);
            input = scanner.nextDouble();
        } while(input <= min || input >= max);

        return input;
    }

    public double getDouble() {
        System.out.println("another double digit number please");
        return scanner.nextDouble();
    }



}
