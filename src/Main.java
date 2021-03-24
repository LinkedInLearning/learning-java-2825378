public class Main {


    public static void main(String[] args) {
        System.out.println(salaryCalc(40, 10.40, 4));
        System.out.println(salaryCalc(0, 10.40, 4));
    }

    public static double salaryCalc(double hours, double hourlyPay, double vacationDays){
        double weeklyPaycheck = hours * hourlyPay;
        double vacationDeduction = vacationDays*8*hourlyPay;

        if (hours < 0 || vacationDays < 0){
            return -1;
        }

        double salary = (weeklyPaycheck * 52) - vacationDeduction;
        return salary;
    }

}
