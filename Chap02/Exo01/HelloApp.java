import java.util.*;

class HelloApp {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input;
        
        System.out.print("What is your name? ");
        input = sc.nextLine();
        sc.close();

        System.out.println("Hello, " + input + " nice to meet you!");
    }

}