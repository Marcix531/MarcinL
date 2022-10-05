public class zad7 {
    public static void main(String[] args)
    {
        long watoscTowaruSprszedanego = 4600000; //zł
        byte iloscprocentNaMazowszu = 62;

        System.out.println("Sprzedaż w regionie mazowieckim : " + ((double)watoscTowaruSprszedanego * ((double)iloscprocentNaMazowszu/100)));
    }
}
