package pl.sdacademy.myproject.instrukcje.przelacz;

import pl.sdacademy.myproject.typydanych.typwyliczeniowy.Plec;
import pl.sdacademy.myproject.typydanych.typwyliczeniowy.Status;

public class SwitchMain {
    public static void main(String[] args) {

        //status użytkownika
        Status statusUżytkownika = Status.AKTYWNY;
        switch(statusUżytkownika){
            case AKTYWNY:
                System.out.println("Aktywny");
                break;
            case ZALOGOWANYy:
                System.out.println("Zalogowany");
                break;
            default:
                System.out.println("Nie znany status");
        }

        //Płeć
        Plec plecUzytkownika = Plec.KOBIETA;
        switch(plecUzytkownika){
            case KOBIETA:
                System.out.println("Kobieta");
                break;
            case MĘŻCZYZNA:
                System.out.println("Mężczyzna");
                break;
            default:
                System.out.println("Nie znana płeć");
        }
    }
}
