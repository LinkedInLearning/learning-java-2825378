import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if(inputtedNum < 5){
            System.out.println("Numer mniejszy niz 5");
        } else {
            System.out.println("Numer wiekszy lub rowny 5");
        }
    }
}
