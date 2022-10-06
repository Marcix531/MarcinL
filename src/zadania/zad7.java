package zadania;

import java.util.Scanner;

public class zad7 {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Podaj 1 imię: " );
            String name1 = keyboard.nextLine();

            System.out.println("Podaj 2 imię: " );
            String name2 = keyboard.nextLine();

            System.out.println("Podaj 3 imię: " );
            String name3 = keyboard.nextLine();

            System.out.println("Imię 1: " + name1 + ", Imię 2: " +
                    name2 + ", Imię 3: " + name3);

        }
}
