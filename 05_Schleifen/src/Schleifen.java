public class Schleifen {
    static void main(String[] args) {

        // Schleifen
        // Kopfgesteuerte Schleife
        // Fussgesteuerte Schleife

        // while Schleife
        int zahl = 1;    // Zählvariable
        while (zahl <= 3) {     // (Abbruch-) Bedingung
            //System.out.println(zahl);
            System.out.println("Hallo");
            zahl++;   // Inkrement
            // zahl = zahl + 1;
        }
        System.out.println("Nach der Schleife");


        // Zahlen von 1 bis 10 untereinander ausgeben

        System.out.println();
        System.out.println("Zahlen von 1 bis 10 ausgeben: (while-Schleife)");
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }

        // for-Schleife (Zählschleife)
        // Zahlen von 1 bis 10 untereinander ausgeben
        System.out.println();
        System.out.println("Zahlen von 1 bis 10 ausgeben: (for-Schleife)");
        // for (zaehlvariable; bedingung; inkrement/dekrement)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        //
    }
}
