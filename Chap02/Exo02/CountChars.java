import java.util.*;

class CountChars {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the input string? ");
        String input = sc.next();
        System.out.println(input + " has " + input.length() + " characters.");
    }
}