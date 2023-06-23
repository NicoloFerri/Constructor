package co.develhope.introduction._16;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

       House casa1 = new House("Via Roma 11" , 5);
        System.out.println("l'indirizzo è = " + casa1.address);
        System.out.println("il numero di piani è = " + casa1.numberOfFloors);

       House casa2 = new House("Via G.Leopardi 33" , 3);
        System.out.println("l'indirizzo è = " + casa2.address);
        System.out.println("il numero di piani è = " + casa2.numberOfFloors);

    }
}
