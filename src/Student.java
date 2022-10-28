import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
        String studentName = "Kyle Harry";
        char studentFirstInitial = studentName.charAt(0);
        char studentLastInitial = studentName.charAt(5);

        System.out.println(studentAge);
        System.out.println(studentName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);

        System.out.println("What GPA do you want to change their GPA to?");

        Scanner input = new Scanner(System.in);

        studentGPA = input.nextDouble();

        if (studentGPA > 2.0) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        System.out.println(studentGPA);

    }
}