public class Arrays {
    static void main(String[] args) {
        // Arrrays sind etwas ähnliches wie Listen in Python
        // -> ein Container

        int zahl1 = 5;
        int zahl2 = 7;
        int zahl3 = 3;
        int zahl4 = 1;

        // Python: zahlen = []
        System.out.println("Array zahlen:");
        int[] zahlen;   // Deklaration des Arrays zahlen vom Typ Integer - es gibt das Array
        zahlen = new int[4];   // Initialisierung mit Standardwerten (4 Elemente)
        System.out.println(zahlen[3]);  // Wert des Elements an Index 3 auslesen
        // zahlen = {1, 2, 3, 4}; das geht so nicht, nur bei der Initialisierung
        zahlen[3] = 5;
        System.out.println(zahlen[3]);

        System.out.println("Array kommaZahlen:");
        // Index:                0     1     2     3
        double[] kommaZahlen = {1.23, 2.23, 4.45, 3.14, 0.12345};    // Deklaration und Initialisierung in einem Schritt
        System.out.println(kommaZahlen);
        System.out.println(kommaZahlen[3]);
        System.out.println("Programmende");

        System.out.println("Alle Elemente eines Arrays ausgeben");
        /*
        System.out.println(kommaZahlen[0]);
        System.out.println(kommaZahlen[1]);
        System.out.println(kommaZahlen[2]);
        System.out.println(kommaZahlen[3]);
        */
        System.out.println();

        for (int i = 0; i <= 3; i++) {
            System.out.println(kommaZahlen[i]);
        }

        System.out.println("Alle Elemente eines Arrays ausgeben");
        System.out.println();

        for (int i = 0; i < kommaZahlen.length; i++) {
            kommaZahlen[i]++;
            System.out.println(kommaZahlen[i]);
        }

        // for zahl in zahlen:
        //     print(zahl)
        // enhanced for-Loop / for-each-Loop
        System.out.println("Alle Elemente eines Arrays mit for-each Loop ausgeben");
        System.out.println();
        for (double element : kommaZahlen) {
            element++;
            System.out.println(element);
        }
        System.out.println(kommaZahlen);

        for (double element : kommaZahlen) {
            System.out.println(element);
        }

    }
}
