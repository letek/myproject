package pl.sdacademy.myproject.typydanych.typwyliczeniowy;

public class TypWyliczeniowyMain {
    public static void main(String[] args) {
        //enum Nazwa (WARTOŚĆ_1,WARTOŚĆ2)
        //uwaga może być w osobnym pliku
        //mamy Janusz//tworzy aplikacje do formatu papieru
        //potrzebuje inf o formacie
        //jak mu ja dostarczamy
        //A4 np w zmiennej String
        String formatA4 = "A4";
        String formatB3 = "Be3";

        //mamy do dyspozycji enum FormatPapieru
        FormatPapieru wybranyFormat;
        wybranyFormat = FormatPapieru.A1;
   //     System.out.println(wybranyFormat);

        //zadanie1
        //utwórz zmienna typu wyliczeniowego Status
        //wartości Aktywny, nieaktywny, zalogowany, nie zalogowany
        // Przykład użycia oraz wypisanie na konsoli
   //     Status okreslonyStatus;
   //     okreslonyStatus = Status.NIE_ZALOGOWANY.ZALOGOWANYy;
   //     System.out.println(okreslonyStatus);




        //zadanie2
        //utwórz zmienna typu wyliczeniowego Plac
        //wartości: mężczyzna, kobieta
        // Przykład użycia oraz wypisanie na konsoli

        Plec konkretnaPlec;
        konkretnaPlec = Plec.KOBIETA;
        PlecKomunikat(konkretnaPlec);
    }

    public static void PlecKomunikat(Plec przekazanaPlec){
        if (przekazanaPlec == Plec.KOBIETA) {
            System.out.println("Płeć to Kobieta");
        }

        else if (przekazanaPlec == Plec.MĘŻCZYZNA) {
            System.out.println("Płeć to Mężczyzna");
        }
    }
}
