package zadania;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj liczbe od 1 do 10)>");
        int number = keyboard.nextInt();


        String out = " ";

        if (number > 0) {
            int lDziesiatek;
            int lJednosci;

            lJednosci = number % 10;
            lDziesiatek = (number - lJednosci) / 10;

            switch (lJednosci) {
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VIII");
                    break;
                case 9:
                    System.out.print("IX");
                    break;
                case 10:
                    System.out.print("X");


            }
        }

        System.out.println(" - odpowiednik tej liczby po rzymsku " + out);
    }
}
