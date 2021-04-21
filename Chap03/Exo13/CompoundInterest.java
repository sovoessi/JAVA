import java.util.*;

class CoumpoundInterest {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] argv) {
        
        int numOfYears, compoundTimes;
        float principal, rateOfInterest, investment;

        System.out.print("What is the principal amount? ");
        principal = sc.nextFloat();
        System.out.print("What is the rate? ");
        rateOfInterest = sc.nextFloat();
        rateOfInterest /= 100;
        System.out.print("What is the number of years? ");
        numOfYears = sc.nextInt();
        System.out.println("What is the number of times the interest is compounded per year? ");
        compoundTimes = sc.nextInt();


        investment = principal * (float) Math.pow(
        1 + (rateOfInterest /compoundTimes), compoundTimes * numOfYears);
    
         investment = Math.round(investment * 100) /100f;

        System.out.print("$" + principal + " invested at " 
        + rateOfInterest*100 + "% for " + numOfYears +" years \ncompounded "
        + compoundTimes + " times per year is $" + investment);    

    }
}