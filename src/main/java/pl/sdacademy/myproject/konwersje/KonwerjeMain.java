package pl.sdacademy.myproject.konwersje;

public class KonwerjeMain {
    public static void main(String[] args) {
        {
            int a = 5;
            double b = 13.5;
            //liczba a zamieniona na double
            double c = b / a;
            System.out.println("c="+c);
            //konwersja niejawna
        }

        {
            int a = 5;
            double b = 13.5;
            //konwersja jawna na int
            //wynik dzielenia został skonwersowany na int'a
            // a potem na double
            double c = (int) b / a;
            System.out.println("c="+c);

        }

        {
            //konwersja jawna
            //a jawnie konwertowana na double
            //to samo co w pierwszym tylko w jawny sposób
            int a = 5;
            double b = 13.5;
            double c = b / (double) a;
            System.out.println("c="+c);
        }
    }
}
