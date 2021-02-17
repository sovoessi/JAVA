import java.util.*;

public class PizzaParty {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args) {
        int amountPeople;
        int amountPizzas;
        int slicesPerPizza;

        System.out.print("How many people? ");
        amountPeople = sc.nextInt();

        System.out.print("How many pizzas do you have? ");
        amountPizzas = sc.nextInt();

        System.out.print("How many slices per pizza do you have? ");
        slicesPerPizza = sc.nextInt();

        System.out.println(amountPeople + " people with " + amountPizzas + " pizzas");

        int slicesPerPerson = (amountPizzas * slicesPerPizza) / amountPeople;
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " +(amountPizzas * slicesPerPizza) % amountPeople+
         " leftover pieces.");
    }
}
