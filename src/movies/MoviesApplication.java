package movies;

import util.Input;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoviesApplication {

    public static Movie[] movieList = MoviesArray.findAll();

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

        int userNumChoice = input.getInt(0, 5);

       if (userNumChoice == 1) {
            for (Movie currentMovie : movieList) {
                System.out.println(currentMovie.getName());
            }
       } else if (userNumChoice == 2) {
            for (Movie currentMovie : movieList) {
                if (currentMovie.getCategory().equalsIgnoreCase("animated")) {
                    System.out.println(currentMovie.getName());
                }
            }
       } else if (userNumChoice == 3) {
            for (Movie currentMovie : movieList) {
                if (currentMovie.getCategory().equalsIgnoreCase("drama")) {
                    System.out.println(currentMovie.getName());
                }
            }
       } else if (userNumChoice == 4) {
            for (Movie currentMovie : movieList) {
                if (currentMovie.getCategory().equalsIgnoreCase("horror")) {
                    System.out.println(currentMovie.getName());
                }
            }
       } else if (userNumChoice == 5) {
            for (Movie currentMovie : movieList) {
                if (currentMovie.getCategory().equalsIgnoreCase("scifi")) {
                    System.out.println(currentMovie.getName());
                }
            }
       } else {
            System.out.println("Ok, thank you, have a good day!");
       }
    }

    static void addMovie(){
        Movie[] addMovie = Arrays.copyOf(movieList, movieList.length + 1);
    }
}



