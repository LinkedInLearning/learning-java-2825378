import java.util.Scanner;

public class Main {
    public static double calculateSalary(double hoursPerWeek, double payRate, int vacationDays){
        double result = hoursPerWeek * payRate * 4 * 12 - vacationDays * 8 * payRate;
        return result;
    }

    public static void main(String[] args){

        System.out.println("Enter number of hours work per week:");
        Scanner input = new Scanner(System.in);
        double hoursPerWeek = Double.valueOf(input.next());
        //System.out.println("Number of hours work per week is:" + hoursPerWeek);
        System.out.println("Enter pay rate per hour:");
        double payRate = Double.valueOf(input.next());
        //System.out.println("Pay rate is:" + payRate);
        System.out.println("Number of vacation days taken:");
        int vacationDays = Integer.valueOf(input.next());

        double grossSalary= calculateSalary(hoursPerWeek,payRate, vacationDays);
        System.out.println("Employee salary:" + grossSalary);
        //Testing 2
    }
}
