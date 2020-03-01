package pl.sdacademy.myproject.instrukcje.warunkowe;

import java.time.*;

public class InstrukcjeWarunkoweMain {
    public static void main(String[] args) {
        //wykonaj motode sprawdzająca pełnoteność
        //wyk instr warunkową
        int wiek = 17;
        System.out.println("Czy pelnoletni = " + czPelnoletni(wiek));
        System.out.println(LocalDate.now());
    }

    public static boolean czPelnoletni(int wiek) {
        if (wiek >17) {
            return true;
        } else {
            return false;
        }
    }
}
