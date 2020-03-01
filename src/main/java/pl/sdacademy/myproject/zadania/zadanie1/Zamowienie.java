package pl.sdacademy.myproject.zadania.zadanie1;

public class Zamowienie {
        int numer;
        double cena;
        String nazwa;

    public Zamowienie(double przypisana_cena, int przypisany_numer, String przypisana_nazwa) {
        numer = przypisany_numer;
        cena = przypisana_cena;
        nazwa =przypisana_nazwa;
    }

    public double pobierzCena(){
        return cena;
    }

    public String toString(){
        return numer +" "+nazwa +" "+ cena;
    }

    public String pobierzNazwa() {
        return nazwa;
    }
}
