package zadania;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        double[] oceny = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("podaj wynik" + i + 1 + " > ");
            oceny[i] = keyboard.nextDouble();
        }

        double srednia = (oceny[0] + oceny[1] + oceny[2]) / 3;
        byte ocena;
        if (srednia >= 90) ocena = 5;
        else if (srednia >= 80) ocena = 4;
        else if (srednia >= 70) ocena = 3;
        else if (srednia >= 60) ocena = 2;
        else ocena = 1;


        System.out.printf("Srednia punktów to %f, ocena z tej średniej to %d", srednia, ocena);
    }
}
