import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalc {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args) {
        int currentAge;
        int retireAge;
        int actualYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        currentAge = sc.nextInt();

        System.out.print("At what age would you like to retire? ");
        retireAge = sc.nextInt();

        int diffAge = retireAge - currentAge;

        System.out.println("You have " + diffAge + " years left until you can retire.");
        System.out.println(
            "It's " + actualYear + 
                ", so you can retire in " + (actualYear +diffAge));

    }
    
}
