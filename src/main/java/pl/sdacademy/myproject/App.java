package pl.sdacademy.myproject;
//generate test
//alt + enter

import static java.lang.Math.PI;

/**
 * App
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public class App {
    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        //System.out.println("Hello World!");
        //dodanie zmiennej Math.PI
        //typ nazwa = wartość

        //double liczba = 3.0; //zmienna ma wartpość 3.0
        //liczba = PI; //zmienna ma wartość Pi
        //liczba = Math.PI;
        //liczba = java.lang.Math.PI;

        //double liczba = 3.6;
        //s int number = 4;
        //System.out.println(number);
        // wypiszLiczbe(number);
        //zwraca ciag znaków
        //String  odpowiedz = coNaObiad();
        //jest przypisana do zmiennej odpowiedź
        // System.out.println(odpowiedz);

        //zadanie:Stworz metode liczca sume trzech liczba całokowitych

        //int pierwsza = 1;
        //int druga = 111;
        //int trzecia = 10;

        System.out.print("Wynik: " + dodajLiczby(1, 20, 300));
    }

    // metoda zwypisuje sume trzech liczb
    private static int dodajLiczby(int pierwsza, int druga, int trzecia) {
        return pierwsza + druga + trzecia;
    }

//tworzenie klasy i konstruktora Zadanie Domowe
    //private static String coNaObiad() {
    //    return "Pomidorowa z rozołu z wczoraj";
    //}

    //Metoda void nic nie zwracas
    //private static void wypiszLiczbe(int number) {
    //    System.out.println("Twoja Liczba to: s" + number);
    //
    //}


}