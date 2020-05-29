import java.util.Scanner;

public class Main {

    public static double grossYearlySalary(double hoursPerWeek, double salaryPerHour, double vacationDays) {
        // Calculate gross salary per year for the employee
        // TODO: add error-prone etc
        int weeksPerYear = 52;
        int hoursPerVacationDay = 8;
        double totalHours = hoursPerWeek * weeksPerYear - vacationDays * hoursPerVacationDay;
        double grossYearlySalary = totalHours * salaryPerHour;
        return grossYearlySalary;
    }

    public static void main(String[] args) {
        // Input 1: How many hours does the employee work per week?
        System.out.println("Please input the no of hours the employee work/week:");
        Scanner hourPerWeekInput = new Scanner(System.in);
        double hoursPerWeek = hourPerWeekInput.nextDouble();

        // Input 2: How much money does the employee make per hour?
        System.out.println("Please input the employee salary per hour:");
        Scanner salaryPerHourInput = new Scanner(System.in);
        double salaryPerHour = salaryPerHourInput.nextDouble();

        // BONUS Input 3: Can you account for the vacation days?
        System.out.println("Please input the number of vacation days used by the employee:");
        Scanner vacationDaysInput = new Scanner(System.in);
        double vacationDays = vacationDaysInput.nextDouble();

        //Output: Employee gross yearly salary
        double grossYearlySalary = grossYearlySalary(hoursPerWeek, salaryPerHour, vacationDays);
        System.out.println("Employee yearly gross salary is: " + grossYearlySalary);
    }

}
