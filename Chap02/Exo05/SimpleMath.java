import java.util.*;

public class SimpleMath {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        long fnum = 0L, snum = 0L;

        System.out.print("What is the first number? ");
        fnum = sc.nextLong();

        System.out.print("What is the second number? " );
        snum = sc.nextLong();

        System.out.println(
            fnum + " + " + snum + " = " + (fnum + snum)
        );

         System.out.println(
            fnum + " - " + snum + 
            " = " + (fnum - snum)
        );

         System.out.println(
            fnum + " * " + snum
            + " = " + fnum * snum
        );

         System.out.println(
            fnum + " / " + snum
            + " = " + fnum / snum
        );
    }
}
