import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class CurrencyConv {

    static Scanner sc = new Scanner(System.in);
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){

        float amount_from = 0.0f;
        float exchange_rate = 0.0f;
        double amount_to = 0.0;

        System.out.print("How many euros are you exchanging? ");
        amount_from = sc.nextFloat();

        System.out.print("What is the exchange rate? ");
        exchange_rate = sc.nextFloat();

        amount_to = amount_from * exchange_rate / 100;

        df.setRoundingMode(RoundingMode.DOWN);

        System.out.println(amount_from + 
            " euros at an exchange rate of " +exchange_rate+ 
            " is " +df.format(amount_to)+ " U.S.dollars."
        );
    }
}