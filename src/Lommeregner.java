import java.util.Scanner;
import java.util.*;

public class Lommeregner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tal1, tal2;
        String matsymbol;

        System.out.println("Indtast det første tal: ");
        tal1 = input.nextInt();

        System.out.println("Indtast det andet tal: ");
        tal2 = input.nextInt();

        Scanner symbol = new Scanner(System.in);

        System.out.println("Indtast regningsart [+, -, * eller /]: ");


        matsymbol = symbol.next();
        switch (matsymbol){
            case "+":
                System.out.println(plus(tal1,tal2));
                break;

            case "-":
                System.out.println(minus(tal1,tal2));
                break;

            case "*":
                System.out.println(gange(tal1, tal2));
                break;

            case "/":
                System.out.println(dividere( tal1, tal2));
                break;

            default:
                System.out.println("Ugyldig regningsart.");
        }

    }
    public static int plus(int x, int y) {
        int resultat = x+y;
        System.out.println("Dit resultat er: ");
        return resultat;
    }

    public static int minus(int x, int y) {
        int resultat = x-y;
        System.out.println("Dit resultat er: ");
        return resultat;
    }

    public static int gange(int x, int y) {
        int resultat = x*y;
        System.out.println("Dit resultat er: ");
        return resultat;
    }

    public static int dividere(int x, int y) {
        int resultat = x/y;
        System.out.println("Dit resultat er: ");
        return resultat;
    }
}
