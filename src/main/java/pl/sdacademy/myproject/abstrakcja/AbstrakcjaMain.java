package pl.sdacademy.myproject.abstrakcja;

import pl.sdacademy.myproject.abstrakcja.figury.Kolo;
import pl.sdacademy.myproject.abstrakcja.figury.Kwadrat;

import java.util.ArrayList;
import java.util.List;

public class AbstrakcjaMain {
    public static void main(String[] args) {


        /**
         * Zadanie
         *
         */
        // Trojkat
        // Trojkat równoboczny
        // prostokąt
        // koło
        // wszystkie figury tworzymy w pakiecie abstrakcja/figury

        // klasa abstrakcyjna Figura w pakiecie abstrakcja

        // interfejs Obliczenia w pakiecie abstrakcja/interfejsy

        // interfejs Informacje w pakiecie abstrakcja/interfejsy

        /*
        Zadanie: Stwórz listę figur ,wypisz informacje
        zsumuj pola;
         */

        Kwadrat kwadrat = new Kwadrat(5);
        Kolo kolo = new Kolo(5);

        List<Figura> listaFigur = new ArrayList();

        listaFigur.add(kwadrat);
        listaFigur.add(kolo);

        for(Figura element: listaFigur){
            //System.out.println(element);
            element.wypiszInformacje();
        }

    }
}
