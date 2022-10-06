import java.util.Scanner;

public class zad10 {
    public static void main(String[] args)
    {
        double wartoscPodatkuStanProcent = 4;
        double wartoscPodatkuLokalProcent = 2;
        Scanner ConsoleInputHandle = new Scanner(System.in);
        System.out.print("Podaj wartość Produktu(double)> ");
        double wartoscProduktu = ConsoleInputHandle.nextDouble();



        double wartoscPodatkuStanowego = wartoscProduktu * (wartoscPodatkuStanProcent/100);
        double wartoscPodatkuLokalnego = wartoscProduktu * (wartoscPodatkuLokalProcent/100);
        double wartoscProduktuZPodatkami = wartoscProduktu + wartoscPodatkuLokalnego + wartoscPodatkuStanowego;




        System.out.print(
                "Wartość produktu:          " + wartoscProduktu + " zł\n" +
                        "Wartość podatku stanowego: " + wartoscPodatkuStanowego + " zł\n" +
                        "Wartość podatku lokalnego: " + wartoscPodatkuLokalnego + " zł\n" +
                        "Cena z podatkami:          " + wartoscProduktuZPodatkami
        );

    }
}
