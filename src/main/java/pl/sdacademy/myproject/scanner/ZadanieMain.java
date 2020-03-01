package pl.sdacademy.myproject.scanner;

import pl.sdacademy.myproject.klasy.User;

import java.util.Scanner;

public class ZadanieMain {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        // tworzymy skanner in -> wejście

        System.out.println("======================================");
        // z użyciem pętli
        System.out.println("==== System Tworzenia Użytkownika ====");
        System.out.println("======================================");

        // wczytywanie imie
        System.out.println("Podaj Imie");
        String wczytaneImie = skaner.nextLine();

        // wczytanie nazwiska
        System.out.println("Podaj Nazwisko");
        String wczytaneNazwisko = skaner.nextLine();

        //wczytanie wieku
        //nextInt()
        System.out.println("Podaj Wiek");
        int wczytanyWiek = skaner.nextInt();

        String imie = wczytaneImie;
        String nazwikso = wczytaneNazwisko;
        int wiek = wczytanyWiek;

        System.out.println("======================================");
        User uzytkownik = new User(imie,nazwikso,wiek);
        System.out.println("INFO: Utworzono użytkownika!");
        // wypiszemy z użyciem toString()
        System.out.println(">>> "+uzytkownik);
    }
}

