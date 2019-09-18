import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        /*2. Create a class named Bob with a main method for the following exercise.

                Bob is a lackadaisical teenager. In conversation, his responses are very limited.

        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        He answers 'Whatever.' to anything else.
        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.*/

        System.out.println("Type your question here: ");
        String userInput = input.nextLine();
        String response;

        if(userInput.endsWith("?")) {
            response = "Sure.";
//            System.out.println(response);
        } else if(userInput.endsWith("!")) {
            response = "Whoa, chill out!";
//            System.out.println(response);
        } else if (userInput.isEmpty()) {
            response = "Fine. Be that way!";
//            System.out.println(response);
        } else {
            response = "Whatever";
//            System.out.println(response);
        }
        System.out.println(response);



    }
}
