import java.util.*;


public class TipApp {

    public static void main(String[] args) {

        float billAmount, tipRate, tip, total;
        billAmount = tipRate = tip = total = 0.0f;

        System.out.print("What is the bill amount?: $");
        Scanner sc = new Scanner(System.in);
        billAmount = sc.nextFloat();

        System.out.print("What is the tip rate? (Enter 10 for 10%): ");
        tipRate = sc.nextFloat();

        tip = calculateTip(billAmount, tipRate);
        total = calculateTotal(billAmount, tip);

        System.out.println("Tip: $" + String.format("%.2f", tip) );
        System.out.println("Total: $" + String.format("%.2f", total) );
        sc.close();
    }

    private static float calculateTip(float billAmount, float tipRate){
        return billAmount * tipRate / 100;
    }

    private static float calculateTotal(float billAmount, float tip){
        return billAmount + tip;
    }
}