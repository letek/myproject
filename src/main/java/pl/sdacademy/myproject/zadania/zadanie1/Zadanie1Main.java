package pl.sdacademy.myproject.zadania.zadanie1;

import org.w3c.dom.ls.LSOutput;
import pl.sdacademy.myproject.Mlotek;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1Main {

    public static void main(String[] args) {
        //tutaj tworzymy zamówienie i wypisujemy cene.

        Zamowienie zamowienie1 = new Zamowienie(12.30, 15, "Bluzka");
        Zamowienie zamowienie2= new Zamowienie(8.30, 16,"Spodnie");
        Zamowienie zamowienie3= new Zamowienie(5.00, 17, "Parasol");
        //gdy mamy list to domyślnie jest to List<Object>
        List<Zamowienie> listaZamowien = new ArrayList<>();

        listaZamowien.add(zamowienie1);
        listaZamowien.add(zamowienie2);
        listaZamowien.add(zamowienie3);

        for (Zamowienie element: listaZamowien){
            element.toString();
            System.out.println(element);
        }




/*        double cena1 = zamowienie1.pobierzCena();
        double cena2 = zamowienie2.pobierzCena();
        double cena3 = zamowienie3.pobierzCena();
        String nazwa1 = zamowienie1.pobierzNazwa();
        String nazwa2 = zamowienie2.pobierzNazwa();
        String nazwa3 = zamowienie3.pobierzNazwa();
        System.out.println(zamowienie1);
        System.out.println(zamowienie2);
        System.out.println(zamowienie3);
        System.out.print("Suma zamówień:");*//*System.out.println("Zamówienia:");
        System.out.print(nazwa1+" ");
        System.out.println(cena1);
        System.out.print(nazwa2+" ");
        System.out.println(cena1);
        System.out.print(nazwa3+" ");
        System.out.println(cena1);*//*

        System.out.println();

        System.out.println(cena1+cena2+cena3);

        System.out.println("=============================");
        StringBuilder bulider1 = new StringBuilder();
        String zString = bulider1.append(zamowienie1).append("\n").
                append(zamowienie2).append("\n").
                append(zamowienie3).append("\n").append("Suma zamówienia: ").
                append(cena1+cena2+cena3).toString();
        System.out.println(zString);*/

    }
}
