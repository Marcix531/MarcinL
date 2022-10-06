package zadania;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj wage:");
        double waga = keyboard.nextDouble();
        System.out.println("Podaj wzrost:");
        double wzrost = keyboard.nextDouble();


        double bmi = (waga / wzrost * wzrost);


        if (bmi < 25) {
            System.out.println("nadwaga");
            System.exit(0);
        }
        if (bmi > 18.5) {
            System.out.println("niedowaga");
            System.exit(0);
        } else
            System.out.println("odpowiednia waga");

    }
}