package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Type something here:");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Type Y/N or yes/no");
        String input = this.scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int number = getInt();
        if(number >= min && number <= max) {
            return number;
        } else {
            System.out.println("out of range, try again");
            return getInt(min,max);
        }
    }

    public int getInt() {
        System.out.println("Enter a number:");
        return Integer.parseInt(this.scanner.nextLine());
    }

    public double getDouble (double min, double max) {
        double number = getDouble("enter a decimal:");
        if(number >= min && number <= max) {
            return number;
        } else {
            System.out.println("out of range, try again");
            return getDouble(min,max);
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(this.scanner.nextLine());
    }

}
