import java.util.*;

class SelfCheckout {

    static final float TAX = 0.055F;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int item1, item2, item3;
        int qty1, qty2, qty3;

        System.out.print("Enter the price of item 1 : ");
        item1 = sc.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        qty1 = sc.nextInt();

        System.out.print("Enter the price of item 2 : ");
        item2 = sc.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        qty2 = sc.nextInt();
        
        System.out.print("Enter the price of item 3 : ");
        item3 = sc.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        qty3 = sc.nextInt();
        
        float subtotal = (item1 * qty1) + (item2 * qty2) + (item3 * qty3);
        
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", subtotal * TAX));
        System.out.println("Total: $" + String.format("%.2f", subtotal * (1+TAX)));
        

    }
}
