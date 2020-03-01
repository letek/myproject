package pl.sdacademy.myproject.dataiczas;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 29.02.2020
 **/
public class DataICzasMain {

    public static void main(String[] args) {

        // przykład użycia daty i czas
        //LocalDateTime dataICzas = LocalDateTime.now();
        //dataICzas.plusDays(3);
        //System.out.println(dataICzas);

        //String napisDataICzas = "2020-02-29 11:46";
        //napisDataICzas += 3;
        //System.out.println(napisDataICzas);

        // konwersja napisu na datę
        String dataJakoNapis = "2020-02-29 11:55";
        String formatDaty = "yyyy-MM-dd HH:mm";

        // tworzymy formater potrzebny do parsowania daty
        // musimy wiedzieć w jakim formacie jest data którą formatujemy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);
        // powstała data poniżej w wyniku parsowania dataJakoNapis
        LocalDateTime data = LocalDateTime.parse(dataJakoNapis, formatter);


        // konwersja daty na napis  - używamy daty, formatuDaty i formatter'a z części powyżej
        String zmiennaDataString = konwersjaDataNaNapis(data, formatter);
        System.out.println("Konwersja Daty na napis");
        System.out.println(zmiennaDataString);

        // konwersja napisu na date - używamy stringuDaty, formatuDaty i formatter'a z części powyżej
        LocalDateTime dataWLocalDateTime = konwersjaNapisNaDate(dataJakoNapis, formatter);
        System.out.println("Konwersja Napisu na Datę");
        System.out.println(dataWLocalDateTime);
    }

    /**
     * Zadanie implementacja metod na podstawie slajdu
     */


    public static LocalDateTime konwersjaNapisNaDate(String dataJakoNapis, DateTimeFormatter formatter) {
        //implementacja
        LocalDateTime dataJakoData = LocalDateTime.parse(dataJakoNapis, formatter);
        return dataJakoData;
    }

    public static String konwersjaDataNaNapis(LocalDateTime data, DateTimeFormatter formatter) {
        //implementacja
        String formatDateTimeString = data.format(formatter);
        return formatDateTimeString;
    }
}
