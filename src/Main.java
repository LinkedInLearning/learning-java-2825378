import java.util.*;
public class Main {

    public static void main(String args[]) {
        String question = "When did India get Independence?";
        String choiceOne = "1942";
        String choiceTwo = "1947";
        String choiceThree = "1950";

        String correctAnswer = choiceTwo;
        String userAnswer;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("The choices are 1:",choiceOne," 2:",choiceTwo," 3:",choiceThree);

        // Have the user input an answer
        Scanner input=new Scanner(System.in);
        // Retrieve the user's input
        userAnswer=input.nextLine();

        // If the user's input matches the correctAnswer...
        if(userAnswer.equals(correctAnswer))
        {
         // then the user is correct and we want to print out a congrats message to the user.
         System.out.println("Congrats");
        }
        // If the user's input does not match the correctAnswer...
        else
        {
         // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
           System.out.println("Wrong answer");
        }

    }

}
