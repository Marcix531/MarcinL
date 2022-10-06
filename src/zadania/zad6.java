package zadania;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("podaj ilosc sekund:");
        int sekundy = Keyboard.nextInt();


        int dni2 = (sekundy%86400);
        int godziny2 = (dni2%3600);
        int minuty2 = (godziny2%60);
        int sekundy2 = minuty2;

        int dni3 = (sekundy/86400);
        int godziny3 = (dni2/3600);
        int minuty3 = (godziny2/60);
        int sekundy3 = minuty2;


        System.out.println(sekundy+" - to"+" "+dni3 +" dni"+" "+godziny3+" godzin"+" "+minuty3+" minut"+" "+sekundy3+" sekund");

    }
}
