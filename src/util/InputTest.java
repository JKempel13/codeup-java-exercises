package util;

import java.util.Scanner;

public class InputTest {
    public static void main (String[] args) {
        Input input = new Input();

//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt(1,10));
        System.out.println(input.getInt());
//        System.out.println(input.getDouble(1, 10));
//        System.out.println(input.getDouble("enter a decimal:"));
//          getBinary("11001101");
//          getHex("10");

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
//
//    public static String getHex (String hex) {
//        try{
//            System.out.println("Enter a hexidecimal number: ");
//            int i = Integer.parseInt(hex,16);
//            System.out.println("Integer value: " + i);
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//        return hex;
//    }

}