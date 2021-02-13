import java.util.Scanner;

public class MadLip {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String noun, verb, adjective, adverb;
        
        System.out.print("Enter a noun: ");
        noun = sc.next();

        System.out.print("Enter a verb: ");
        verb = sc.next();

        System.out.print("Enter an adjective: ");
        adjective = sc.next();

        System.out.print("Enter an adverb: ");
        adverb = sc.next();

        System.out.print(
            String.format(
            "Do you %s your %s %s %s? That's hilarious!", noun, verb, adjective, adverb
            )
        );

    }
}
