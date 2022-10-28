import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String question = "What color am I?";
        String answer1 = "blue";
        String answer2 = "red";
        String answer3 = "orange";

        String correctAnswer = answer1;

        System.out.println(question + " choose one: " + answer1 + ", " + answer2 + ", or " + answer3);

        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.next();

        if (answer1.equals(input.toLowerCase())) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect, try " + answer1);
        }

    }

}