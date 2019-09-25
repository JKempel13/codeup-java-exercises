package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static Movie[] movieList = MoviesArray.findAll();
    public static Movie[] categoryList = MoviesArray.findAll();

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: ");

//        System.out.println(input.getInt());

        if(input.getInt() == 1) {
            for (Movie currentMovie : movieList) {
                System.out.println(currentMovie.getName());
//                System.out.println(currentMovie.getCategory());
            }
        } else if (input.getInt() == 2) {
        }
    }
}


