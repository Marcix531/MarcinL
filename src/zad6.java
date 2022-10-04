class Pokojzad6
{
    public int wymiarX = 1;
    public int wymiarY = 1;

    public int polePowierszchni()
    {
        return wymiarX * wymiarY;
    }

    public void pokojkwadratowy()
    {
        if(wymiarX != 1) {
            wymiarY = wymiarX;
        }
        else {
            wymiarX = wymiarY;
        }
    }
}

    public class zad6 {

        public static void main(String[] args)
        {
            Pokojzad6 pomieszczenie1 = new Pokojzad6();
            pomieszczenie1.wymiarX = 3;
            pomieszczenie1.wymiarY = 4;

            Pokojzad6 pomieszczenie2 = new Pokojzad6();
            pomieszczenie2.wymiarX = 3;
            pomieszczenie2.wymiarY = 4;

            Pokojzad6 pomieszczenie3 = new Pokojzad6();
            pomieszczenie3.wymiarY = 2;
            pomieszczenie3.wymiarX = 3;

            Pokojzad6 pomieszczenie4 = new Pokojzad6();
            pomieszczenie4.wymiarX = 2;
            pomieszczenie4.pokojkwadratowy();

            int liczbaMieszkancow = 4;

            int poleCalkowite = pomieszczenie1.polePowierszchni() + pomieszczenie2.polePowierszchni() + pomieszczenie3.polePowierszchni() + pomieszczenie4.polePowierszchni();

            System.out.println("Powierzkchnia prszypadajaca na jedna osoba™ to: " + (float)poleCalkowite/(float)liczbaMieszkancow);

        }
    }