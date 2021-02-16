import java.util.*;


public class RectRoomArea {

    static Scanner sc = new Scanner(System.in);

    static final double CONVERSION_FACTOR = 0.09290304;

    public static void main(String [] args){

        float room_length = 0.0f;
        float room_width = 0.0f;
        double area = 0.0;
        double area_in_metrics = 0.0;

        System.out.print("What is the length of the room in feet? ");
        room_length = sc.nextFloat();

        System.out.print("What is the width of the room in feet? ");
        room_width = sc.nextFloat();

        System.out.print("You entered dimensions of " + 
                room_length + " feet by " + room_width + " feet.");

        area = room_length * room_width;
        area_in_metrics =  Math.round(area *CONVERSION_FACTOR * 1000) / 1000d;
        System.out.println("The area is ");
        System.out.println(String.format("%.0f", area) + " square feet");
        System.out.println(area_in_metrics + "  square meters");
    }
}