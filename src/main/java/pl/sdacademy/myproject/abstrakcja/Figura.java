package pl.sdacademy.myproject.abstrakcja;

import pl.sdacademy.myproject.abstrakcja.interfejsy.Informacje;
import pl.sdacademy.myproject.abstrakcja.interfejsy.Obliczenia;

public abstract class Figura  implements Informacje, Obliczenia {
   protected String nazwa;


   @Override
   public void wypiszInformacje() {
      System.out.println("===================================");
      System.out.println("Pole = "+obliczPole());
      System.out.println("Obwód = "+obliczObwod());
      wypiszNazwe();
   }

   @Override
   public void wypiszNazwe() {
      System.out.println(nazwa);
   }

   @Override
   public abstract float obliczPole();

   @Override
   public abstract float obliczObwod();
}
