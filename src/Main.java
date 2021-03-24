import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is Beyonce's last name?";
        String choiceOne = "Turner";
        String choiceTwo = "Knowles";
        String choiceThree = "Smith";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println("Choose one of the follwoing: " + choiceOne + "," + choiceTwo + "," + choiceThree + "."  );

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);

        // Retrieve the user's input
        String userAnswer = scanner.nextLine();

        // If the user's input matches the correctAnswer...
        if (userAnswer.equals("Knowles")) {
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Congrats! That's right!");
        } else {
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Wrong :( Her last name is Knowles.");
        }
    }
}
