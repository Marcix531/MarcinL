package zadania;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        int x, y;

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Podaj dzień: ");
        int dzien = keyboard.nextInt();
        System.out.println("Podaj miesiąc: ");
        int miesiac = keyboard.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        int rok = keyboard.nextInt();



        if (dzien * miesiac == rok) {
            System.out.println("To jest magiczna data");
        } else {
            System.out.println("To nie jest magiczna data");

        }
    }
}

