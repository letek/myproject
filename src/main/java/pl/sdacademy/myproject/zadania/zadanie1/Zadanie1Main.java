package pl.sdacademy.myproject.zadania.zadanie1;

import org.w3c.dom.ls.LSOutput;
import pl.sdacademy.myproject.Mlotek;

public class Zadanie1Main {

    public static void main(String[] args) {
        //tutaj tworzymy zamówienie i wypisujemy cene.
        Zamowienie zamowienie1 = new Zamowienie(12.30, 15, "Bluzka");
        Zamowienie zamowienie2= new Zamowienie(8.30, 16,"Spodnie");
        Zamowienie zamowienie3= new Zamowienie(5.00, 17, "Parasol");
        double cena1 = zamowienie1.pobierzCena();
        double cena2 = zamowienie2.pobierzCena();
        double cena3 = zamowienie3.pobierzCena();
        String nazwa1 = zamowienie1.pobierzNazwa();
        String nazwa2 = zamowienie2.pobierzNazwa();
        String nazwa3 = zamowienie3.pobierzNazwa();
        System.out.println("Zamówienia:");
        System.out.println(nazwa1);
        System.out.println(nazwa2);
        System.out.println(nazwa3);
        System.out.print("Suma zamówień:");
        System.out.println(cena1+cena2+cena3);

    }
}
