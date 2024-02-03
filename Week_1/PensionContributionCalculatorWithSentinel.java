import java.text.DecimalFormat;
import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    final static int SALARY_CEILING = 6000;
    final static double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    final static double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    final static double EMPLOYEE_RATE_55_TO_60 = 0.13;
    final static double EMPLOYER_RATE_55_TO_60 = 0.13;
    final static double EMPLOYEE_RATE_60_TO_65 = 0.075;
    final static double EMPLOYER_RATE_60_TO_65 = 0.09;
    final static double EMPLOYEE_RATE_65_ABOVE = 0.075;
    final static double EMPLOYER_RATE_65_ABOVE = 0.09;

    public static void main(String[] args) {
        int salary = 0;
        int age;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end): $");
        salary = in.nextInt();

        while (salary != -1){
        System.out.print("Enter the age: ");
        age = in.nextInt();
        printRateDonateOfAge(age, salary);
        System.out.print("Enter the monthly salary (or -1 to end): $");
        salary = in.nextInt();
        }
    }

    private static double calculatorPensionFund(double rate_salary_donate, int salary){
        double rate_donate = 0;
        if (salary > 0 && salary <= SALARY_CEILING){
            rate_donate = salary*((double) rate_salary_donate);
        }else if (salary > SALARY_CEILING){
            rate_donate = SALARY_CEILING*((double) rate_salary_donate);
        }else{
            System.out.println("You don't have money to donates");
        }
        return rate_donate;
    }

    private static void printRateDonateOfAge(int age, int salary) {
        DecimalFormat df = new DecimalFormat("#.00");
        if(age > 0 && age <= 55){
            System.out.println("The employee's contribution is: $" + df.format(calculatorPensionFund(EMPLOYEE_RATE_55_AND_BELOW, salary)));
            System.out.println("The employer's contribution is: $" + df.format(calculatorPensionFund(EMPLOYER_RATE_55_AND_BELOW, salary)));
            System.out.println("The total contribution is: $" + df.format(calculatorPensionFund(EMPLOYER_RATE_55_AND_BELOW, salary) + calculatorPensionFund(EMPLOYEE_RATE_55_AND_BELOW, salary)));
        } else if(age > 55 && age <= 60){
            System.out.println("The employee's contribution is: $" + df.format(calculatorPensionFund(EMPLOYEE_RATE_55_TO_60, salary)));
            System.out.println("The employer's contribution is: $" + df.format(calculatorPensionFund(EMPLOYER_RATE_55_TO_60, salary)));
            System.out.println("The total contribution is: $" + df.format(calculatorPensionFund(EMPLOYER_RATE_55_TO_60, salary) + calculatorPensionFund(EMPLOYEE_RATE_55_TO_60, salary)));
        } else if(age > 60 && age <= 65){
            System.out.println("The employee's contribution is: $" + df.format(calculatorPensionFund(EMPLOYEE_RATE_60_TO_65, salary)));
            System.out.println("The employer's contribution is: $" + df.format(calculatorPensionFund(EMPLOYER_RATE_60_TO_65, salary)));
            System.out.println("The total contribution is: $" + df.format(calculatorPensionFund(EMPLOYER_RATE_60_TO_65, salary) + calculatorPensionFund(EMPLOYEE_RATE_60_TO_65, salary)));
        } else if(age > 65){
            System.out.println("The employee's contribution is: $" + df.format(calculatorPensionFund(EMPLOYEE_RATE_65_ABOVE, salary)));
            System.out.println("The employer's contribution is: $" + df.format(calculatorPensionFund(EMPLOYER_RATE_65_ABOVE, salary)));
            System.out.println("The total contribution is: $" + df.format(calculatorPensionFund(EMPLOYER_RATE_65_ABOVE, salary) + calculatorPensionFund(EMPLOYEE_RATE_65_ABOVE, salary)));
        }else{
            System.out.println("You are not in the age range" );
        }
    }
}
