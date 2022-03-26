import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Say my name!";
        String choiceOne = "Willie Wonka";
        String choiceTwo = "Woodrow Wilson";
        String choiceThree = "Walter White";
        
        String correctAnswer = choiceThree;
        
        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        
        Scanner input = new Scanner(System.in);
        // Have the user input an answer
        // Retrieve the user's input
        String userAnswer = input.next();
        input.close();
        
        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        
        if(userAnswer.equals(correctAnswer)) {
            System.out.println("Congrats! You have choosen the correct answer!!!");
        };
        
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        
        if(!userAnswer.equals(correctAnswer)) {
            System.out.println("You failed!!!");
        }
    }

}
