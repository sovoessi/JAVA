import java.util.*;

class PrintCalc {

    static Scanner sc = new Scanner(System.in);

    static final int CONVERSION_RATE = 350;

    public static void main(String [] args) {
        
        float length = 0.0F;
        float width = 0.0F;
        double area = 0.0;
        double paint = 0;

        System.out.print("Enter length: ");
        length = sc.nextFloat();

        System.out.print("Enter width: ");
        width = sc.nextFloat();

        area = length * width;

        paint = Math.ceil(area / CONVERSION_RATE);

        System.out.println(
            "You will need to purchase "+paint+ " gallons of\npaint to cover " +area+ " square feet"
            );

    }
}