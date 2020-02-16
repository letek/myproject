package pl.sdacademy.myproject.interfejsy;

public class RynekMCDonaldImpl implements McDonald {

    @Override
    public void poproszeFrytki(double kwota) {
        System.out.println("Witamy w McDonald na rynku");
        System.out.println("Oto Twoje frytki");
    }

    @Override
    public void poproszeFlury(double kwota) {
        System.out.println("Witamy w McDonald na rynku");
        System.out.println("Oto Twój McFlury");
    }
}
