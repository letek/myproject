package pl.sdacademy.myproject.klasy;

public class User {
    String imie;
    String nazwisko;
    int wiek;

    public User(){
    }

    public User(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

/*
    public String getImie() {
        imie = "Kazimierz";
        return imie;
    }

    public byte getWiek() {
        wiek = 50;
        return wiek;
    }


    public String getNazwisko() {
        nazwisko = "Kazimierski";
        return nazwisko;
    }
*/

    /*public String toString() {
        String imie = "Kazimierz";
        String nazwisko = "Kwiatkowski";
        int wiek = 50;
        String wynik = imie + " " + nazwisko + " " + wiek;
        return wynik;
    }*/

    public String toString() {
        String wynik = imie + " " + nazwisko + " " + wiek;
        return wynik;
    }
}
