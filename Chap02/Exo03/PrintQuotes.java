import java.util.*;

public class PrintQuotes {
    static Scanner sc = new Scanner(System.in);   
    
    public static void main(String[] args) {
        String quote, author;
        
        System.out.print("What is the quote? ");
        quote = sc.nextLine();
        
        System.out.print("Who said it? ");
        author = sc.nextLine();
        
        System.out.println( author + " says, " + 
                "\"" + quote + "\"" );
    }
}
