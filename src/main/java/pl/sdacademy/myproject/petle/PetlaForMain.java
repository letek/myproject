package pl.sdacademy.myproject.petle;

public class PetlaForMain {

    public static void main(String[] args) {

        int tablicaLiczb[] = new int[3];
        tablicaLiczb[0] = 20;
        tablicaLiczb[1] = 19;
        tablicaLiczb[2] = 18;

        for (int y : tablicaLiczb) {
            System.out.println(y);
        }

        String tablicaMiast[] = {"Toruń", "Poznań", "Berlin"};

        /**
         * Zadanie: Wypisz w pętli for elementy tablic
         */

        for (String x : tablicaMiast) {
            System.out.println(x);
        }
    }
}