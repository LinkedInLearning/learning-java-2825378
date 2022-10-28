public class Salary {

    public static double salary(double hoursWorked, 
                                double hourlyWage, 
                                int vacationDaysTaken) {
        if (hoursWorked < 0) {
            return -1;
        }

        if (hourlyWage < 0) {
            return -1;
        }

        double yearlySalary = (hoursWorked * 2080) - (vacationDaysTaken * 8) * hourlyWage;
       return yearlySalary; 
    }
   public static void main(String[] args){
    System.out.println(salary(8, 10,5));
   } 
}
