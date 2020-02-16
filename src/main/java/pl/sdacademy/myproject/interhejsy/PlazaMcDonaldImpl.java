package pl.sdacademy.myproject.interhejsy;

public class PlazaMcDonaldImpl implements McDonald {

    @Override
    public void poproszeFrytki(double kwota) {
        System.out.println("Witamy w PlazaMcDonald");
        System.out.println("Oto Twoje frytki");
    }

    @Override
    public void poproszeFlury(double kwota) {
        System.out.println("Witamy w PlazaMcDonald");
        System.out.println("Oto Twój McFlury");
    }
}

