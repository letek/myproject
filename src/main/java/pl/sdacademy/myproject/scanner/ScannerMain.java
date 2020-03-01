package pl.sdacademy.myproject.scanner;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        String napis = "Toruń moje miasto!\nRok 2020";
        Scanner skaner = new Scanner(napis);// tworzymy skanner
        // nextLine() pobieramy linię
        String liniaPierwszaZNapisu = skaner.nextLine();
        System.out.println("Linia1:" + liniaPierwszaZNapisu);
        String liniaDrugaZNapisu = skaner.nextLine();
        System.out.println("Linia2:" + liniaDrugaZNapisu);
    }
    {
        String napis = "Toruń moje miasto!\nRok 2020";
        Scanner skaner = new Scanner(napis);// tworzymy skanner

        System.out.println("==============");
        // z użyciem pętli

        while (skaner.hasNext()) {
            System.out.println(skaner.nextLine());
        }
    }

}
