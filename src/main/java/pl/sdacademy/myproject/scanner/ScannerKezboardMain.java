package pl.sdacademy.myproject.scanner;

import java.util.Scanner;

public class ScannerKezboardMain {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        // tworzymy skanner in -> wejście

        System.out.println("==============");
        // z użyciem pętli

        // powyższe wczytywanie z użyciem pętli line
        while (skaner.hasNext()) {
            String wczytanaLinia = skaner.nextLine();
            System.out.println(wczytanaLinia);
            // equalsIgnoreCase - równe nie zależnie od wielkości liter
            // contains - zawiera
            if(wczytanaLinia.equalsIgnoreCase("x")){
                break;
            }
        }
        System.out.println("Koniec.");
    }
}
