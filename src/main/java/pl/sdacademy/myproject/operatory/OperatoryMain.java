package pl.sdacademy.myproject.operatory;

public class OperatoryMain {
    public static void main(String[] args) {
        {//przypisania
            int a = 5;
            a += 5; //zwiększnie o 5
            a -= 2; //zmiejszenie o 2
            a *= 8; //pomnożenie o
            a /= 16;//podzielenie o

            System.out.println(a);
            System.out.println(("============================"));
        }
        {
            //arytmetyczne
            int a = 5;
            int b = 3;
            int c = a + b;
            c = a - b;
            c = a / a;
            c = a * b;
            c = a % b; //mozna odrużnić liczby parzyste od nieparzystych
            //modulo - reszta z dzielenia
            c++;
            c--;//zmniejszenie o 1


            System.out.println(c);
        }

        {//logiczne
            boolean jestCieplo = true;
            boolean padaDeszcz = true;
            boolean mamParasol = false;

            boolean czyJestZimno = !jestCieplo;// negacja
            boolean czyIdeNaSpacer = !jestCieplo && padaDeszcz; //logiczne i
            System.out.println(czyIdeNaSpacer);

            boolean jestKawa = true;
            boolean jestCiasto = false;
            boolean ideNaObiad = jestKawa || jestCiasto; //logiczne lub
        }
        {
            //Relacji == <= >= < > !=
            int wiek = 33;
            int wiekPlenoletnosci = 18;
            int ograniczeniePredkowski = 50;
            boolean czyPelnoletni = wiek > wiekPlenoletnosci;
            int predkosci = 120;
            boolean czuDostenMandat = predkosci >= ograniczeniePredkowski;
            int wiekOli = 23;
            int wiekJanusz = 24;
            boolean czyMajaTenSamWiek = (wiekOli == wiekJanusz); //prownanie
            boolean czyMajaRoznyWiek = (wiekOli != wiekJanusz); //różne, nie równe
        }
    }
}
