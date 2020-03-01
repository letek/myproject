package pl.sdacademy.myproject.abstrakcja.figury;

import pl.sdacademy.myproject.abstrakcja.Figura;
import pl.sdacademy.myproject.abstrakcja.interfejsy.Informacje;

public class Kolo extends Figura {
    private int a;
    public Kolo() {
        nazwa = "Kolo";
    }
    public Kolo(int a) {
        this(); //wyłołanie konstruktora domyślengo
        this.a=a;
    }

    @Override
    public float obliczPole() {
        return (float) (3.14F*(a*a));
    }

    @Override
    public float obliczObwod() {
        return (float) (2*3.14F*a);
    }
}
