package pl.sdacademy.myproject;

public class Mlotek {

    String kolor; //właściwość, pole

    //konstruktor domyślny w klasie Mlotek()
    //domyslny młotek jest czerwony
    public Mlotek(){
        //konstruktor bez argumentowy
        //domyślne właściwości
        kolor = "czerwony";
    }

    //konstruktor argumentowy argument kolor mlotka
    public Mlotek(String wprowadzonyKolor){
        kolor = wprowadzonyKolor;
    }

    // metoda do pobierania koloru młotka
    public String pobierzKolor() {
        return kolor;
    }

    public String toString() {
        return getClass().getSimpleName()+" "+kolor;
    }
}
