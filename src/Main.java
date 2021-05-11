import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        String question = "What is the capital of New York?";
        String choiceOne = "Buffalo";
        String choiceTwo = "Albany";
        String choiceThree = "New York City";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println("The choices are: " + choiceOne + ", " + choiceTwo + ", " + "or " + choiceThree + ".");

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);

        // Retrieve the user's input
        String input = scanner.nextLine();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (correctAnswer.equals(input)) {
            System.out.println("Congratulations! That is the correct answer!");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
            System.out.println("I'm sorry, that is incorrect. The correct answer is " + correctAnswer + ".");
        }

    }

}
