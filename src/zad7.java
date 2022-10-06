public class zad7 {
    public static void main(String[] args)
    {
        long watoscTowaruSprzedanego = 4600000; //zł
        byte iloscprocentNaMazowszu = 62;

        System.out.println("Sprzedaż w regionie mazowieckim : " + ((double)watoscTowaruSprzedanego * ((double)iloscprocentNaMazowszu/100)));
    }
}
