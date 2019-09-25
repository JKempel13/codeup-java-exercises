import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    //    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    static String[] adjectives = {"alert","careful","angry","hollow","large","loud","fast","wide","small","easy"};
    static String[] nouns = {"area","child","company","money","life","place","school","study","world","night"};

    static String randomElement(String[] arr) {
        Random random = new Random();
        return arr[random.nextInt(adjectives.length)];
    }

    public static void main (String[] args) {
        System.out.println("Here is your server name: \n" + randomElement(adjectives) + " - " + randomElement(nouns));
    }
}
