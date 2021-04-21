import java.util.*;


class SimpleInterest {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numOfYears;
        float principal, rateOfInterest, investment;

        System.out.print("Enter the principal: ");
        principal = sc.nextFloat();
        System.out.print("Enter the rate of interest: ");
        rateOfInterest = sc.nextFloat();
        System.out.print("Enter the number of years: ");
        numOfYears = sc.nextInt();

        investment = principal * (1 + rateOfInterest/100 *numOfYears);
        investment = Math.round(investment * 100) /100f;

        System.out.print("After " +numOfYears+ " years at " +
            rateOfInterest+"%, the investment will be worth $"+ investment);    

    }
}