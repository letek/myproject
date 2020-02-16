package pl.sdacademy.myproject.interfejsy;

public class InterfejsyMain {

    public static void main(String[] args) {
        //camelCase - metoda Wielbłądzia
        // zmałejKolejnyWyrazZDużejBezSpacji
        McDonald mcDonaldNaRynku;

        //inicjalizacja

        mcDonaldNaRynku = new RynekMCDonaldImpl();
            //Zadanie 1.
            //Poproś o frytki i mcflury w mcdonalds na rynku

       mcDonaldNaRynku.poproszeFrytki(20);
        mcDonaldNaRynku.poproszeFlury(12);

            //Zadanie 2
            //Stwórz implementację PlazaMcDonald
            //pofobnie jak w pryoadku rynku wykonaj polecenia w Plazie
        McDonald mcDonaldPlaza;
        mcDonaldPlaza = new PlazaMcDonaldImpl();

        mcDonaldPlaza.poproszeFrytki(20);
        mcDonaldPlaza.poproszeFlury(12);



            //@Override
            //public void poproszeFrytki(double kwota) {

            //}

            //@Override
            //public void poproszeFlury(double kwota) {

            //}

    }
}
