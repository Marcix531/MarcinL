
class Pokoj
{
    public int wymiarX = 1;
    public int wymiarY = 1;
    public int polePowierszchni()
    {
        return wymiarX * wymiarY;
    }
    public void kwadratowypokoj()
    {
        if(wymiarX != 1) {
            wymiarY = wymiarX;
        }
        else {
            wymiarX = wymiarY;
        }
    }
}
public class zad5 {
    public static void main(String[] args)
    {
       Pokoj pomieszczenie1 = new Pokoj();
        pomieszczenie1.wymiarX = 3;
        pomieszczenie1.wymiarY = 4;

        Pokoj pomieszczenie2 = new Pokoj();
        pomieszczenie2.wymiarX = 3;
        pomieszczenie2.wymiarY = 4;

        Pokoj pomieszczenie3 = new Pokoj();
        pomieszczenie3.wymiarY = 2;
        pomieszczenie3.wymiarX = 3;

        Pokoj pomieszczenie4 = new Pokoj();
        pomieszczenie4.wymiarX = 2;
        pomieszczenie4.kwadratowypokoj();

        int poleCalkowite = pomieszczenie1.polePowierszchni() + pomieszczenie2.polePowierszchni() + pomieszczenie3.polePowierszchni() + pomieszczenie4.polePowierszchni();
        System.out.println("Pokoj 1: Dlugosc: " + pomieszczenie1.wymiarX + " Szerokosc: " + pomieszczenie1.wymiarY + " Pole: " + pomieszczenie1.polePowierszchni() + "\n" +
                "Pokoj 2: Dlugosc: " + pomieszczenie2.wymiarX + " Szerokosc: " + pomieszczenie2.wymiarY + " Pole: " + pomieszczenie2.polePowierszchni() + "\n" +
                "Pokoj 3: Dlugosc: " + pomieszczenie3.wymiarX + " Szerokosc: " + pomieszczenie3.wymiarY + " Pole: " + pomieszczenie3.polePowierszchni() + "\n" +
                "Pokoj 4: Dlugosc: " + pomieszczenie4.wymiarX + " Szerokosc: " + pomieszczenie4.wymiarY + " Pole: " + pomieszczenie4.polePowierszchni() + "\n" +
                "Pole całkowite wszystkich pokoii to: " + poleCalkowite
        );

    }
}