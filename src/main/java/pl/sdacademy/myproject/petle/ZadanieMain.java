package pl.sdacademy.myproject.petle;

public class ZadanieMain {
    public static void main(String[] args) {
        // Zadanie
        //==============
        // stworzenie tablicy imion
        // w pętli wypisz imion zawierający literę "a"
        // skorzystaj z metody contains
        // przykład :
        //
        //          imie.contains("a")

        String tablicaImion[] = {"Kasia", "Renata", "Zenon", "Krysia", "Olgierd", "Beno"};

        //petla for
        for (String imie : tablicaImion) {
            if (imie.contains("a"))
                System.out.println(imie);
        }
        System.out.println("==========================");
        //petla while
        int licznik=0;
        while (licznik<6){
            if (tablicaImion[licznik].contains("a"))
                System.out.println(tablicaImion[licznik]);
            licznik++;
        }
    }
}
