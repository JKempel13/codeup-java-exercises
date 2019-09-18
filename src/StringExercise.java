public class StringExercise {
    public static void main(String[] args) {

        String cat = "cat";

        String catNoC = cat.substring(1, cat.indexOf("t") + 1);
        String catPigLatin = catNoC + "cay";

        System.out.println(catPigLatin);

//        String message = "We don't need no education \nWe don't need no thought control";

//        String message = "Check \"this\" out, \"s inside of \"s!";

//        String message = "In windows, the main drive is usually C:\\";

        String message = "I can do backslashes \\, double backslashes \\\\, \nand the amazing triple backslash \\\\\\!";
        System.out.println(message);

    }
}
