package pl.sdacademy.myproject.powtorka;

import pl.sdacademy.myproject.Mlotek;

public class Pomocnik {
    //domyślny bez rgumentowy konstruktor

    //metodadjMlotek() daje nowy mlotek
    public Pomocnik() {
    }

    public Mlotek dajMlotek() {
        Mlotek mlotek1 = new Mlotek();
        return mlotek1;
    }
}
