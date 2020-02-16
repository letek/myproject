package pl.sdacademy.myproject.stringbuilder;

import java.sql.SQLOutput;

public class BuilderMain {
    public static void main(String[] args) {

        String napisCudzysłow ="";
        String napisZKonstruktora = new String(""); //obydwa powyzej są identyczne w działaniu
        String napisNull = null;
        String napisBezInicjalizacji;
        String napis = "Liczba %d %d  \n";
        System.out.print(napis);
        //brak znaku nowego wiersza
        System.out.printf(napis,12,15);
        //oznacza formatowanie tekstu
        //%d oznacza liczbę dziesiętną
        System.out.println("Napis");
        System.out.print(napisZKonstruktora);
        System.out.println(napisNull);

        String napiszKwota = "Kwota %.2f zł";
        System.out.printf(napiszKwota, 12.34523542354235);
        //System.out.println(napisBezInicjalizacji);

        StringBuilder bulider = new StringBuilder();
        System.out.println( bulider.append("Kwota").append(" "));
    }
}
