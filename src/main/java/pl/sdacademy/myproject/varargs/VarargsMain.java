package pl.sdacademy.myproject.varargs;

public class VarargsMain {
    //psvm
    public static void main(String[] args) {
        // varargs - zmienna liczba argumentów
        {
            int a = 5, b = 3;
            int wynik = suma(a, b);
            System.out.println(wynik);
        }
        {
            int a = 5, b = 3,c = 7;
            int wynik = suma(a, b,c);
            System.out.println(wynik);
        }

        {
            int wynik = suma();
            System.out.println(wynik);
        }
    }

    private static int suma(int...liczby){
        int suma=0;
        for (int liczba :liczby){
            suma += liczba;
        }
        return suma;
    }

    //nie potrzebujemy
/*    private static int suma(int a, int b) {
        return a + b;
    }*/
}
