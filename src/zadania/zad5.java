package zadania;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj masę:");
        double masa = keyboard.nextDouble();


        double ciężar = (masa * 9.8);


        if (ciężar > 1000) {
            System.out.println("Obiekt jest za ciężki");
            System.exit(0);
        }
        if (ciężar < 10) {
            System.out.println("Obiekt jest za lekki");
            System.exit(0);
        } else
            System.out.println("Obiekt ma dobra wage");

    }
}