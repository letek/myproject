package pl.sdacademy.myproject.abstrakcja.figury;

import pl.sdacademy.myproject.abstrakcja.Figura;
import pl.sdacademy.myproject.abstrakcja.interfejsy.Informacje;

public class Kwadrat extends Figura{
    private int a;

    private Kwadrat() {
        nazwa = "Kwadrat";
    }

    public Kwadrat(int a) {
        this(); //wyłołanie konstruktora domyślengo
        this.a=a;
    }

    @Override
    public float obliczPole() {
        
        return a*a;
    }

    @Override
    public float obliczObwod() {
        return a*4  ;
    }
}
