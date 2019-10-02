package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
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

//    Integer.valueOf(String s);
//    Double.valueOf(String s);
    public int getInt() {
        System.out.println("Enter a number:");
        try{
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.println("That is not a number");
//            e.printStackTrace();
            return getInt();
        }
    }

    double getDouble (double min, double max) {
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
        try {
            return Double.parseDouble(this.scanner.nextLine());
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
        return getDouble(prompt);
    }

//    public static String getBinary (String binary) {
//        try{
//            int i = Integer.parseInt(binary,2);
//            System.out.println("Integer value: " + i);
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//        return binary;
//    }

}