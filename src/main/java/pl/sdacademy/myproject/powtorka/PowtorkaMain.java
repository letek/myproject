package pl.sdacademy.myproject.powtorka;

import pl.sdacademy.myproject.Mlotek;

public class PowtorkaMain {
    public static void main(String[] args) {

        Pomocnik panZObi = new Pomocnik();

        Mlotek mlotekOdPanaZObi = panZObi.dajMlotek();
        System.out.println(mlotekOdPanaZObi);
    }
}
