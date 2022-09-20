import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner khervyn = new Scanner(System.in);
        String question = "What is the capital of India?";
        String choiceOne = "Mumbai";
        String choiceTwo = "new delhi";
        String choiceThree = "Kolkatta";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Options are :- \n (Mumbai , New Delhi , Kolkatta)");
        // Have the user input an answer
	System.out.print("Please input your answer => ");
        String answer = khervyn.nextLine();
	answer=answer.toLowerCase();
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        if(answer.equals(correctAnswer)){
        System.out.println("Congratulations!!, You are right.");
        }
        else{
        System.out.println("Wrong answer!! The correct answer is "+choiceTwo);
        }
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
