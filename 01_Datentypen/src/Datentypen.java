public class Datentypen {
    static void main(String[] args) {
        /*
        In Java gibt es zwei verschiedene Arten von Datentypen:
        - Primitive Datentypen: int, double, char, boolean
        - Komplexe Datentypen -> Klassen, z.B. String
         */
        // int: Datentyp (Integer)
        // ganzeZahl: Name der Variable
        // 4: Wert der Variable
        int ganzeZahl = 4;   // 32 Bit
        int riesigeZahl = 2147483647;
        //int riesigeZahl = 2147483648; // ist zu gross für int -> wir müssen double nehmen
        long nochRiesigereZahl = 2147483648l; // 64 Bit
        System.out.println(ganzeZahl);
        System.out.println(riesigeZahl);

        // 3.14
        // Mehrere Datentypen für Gleitkommazahlen:
        // float   -> 32 Bit
        // double  -> 64 Bit
        float kommaZahlFloat = 3.14f;   // 32 Bit
        double kommaZahlDouble = 3.14;  // 64 Bit
        System.out.println(kommaZahlFloat);
        System.out.println(kommaZahlDouble);

        // Wahrheitswert / Boolean: true oder false
        boolean wahrheitswert = true; // 1 Bit
        System.out.println(wahrheitswert);

        // einzelnes Zeichen
        // muss in einfache Hochkommata (') eingefasst werden
        char zeichen = 'c';   // 16 Bit
        System.out.println(zeichen);

        // Zeichenkette / String
        // muss in doppelte Anführungszeichen (") eingefasst werden
        // Datentyp String ist eine Klasse (beginnt mit einem Grossbuchstaben)
        String zeichenkette = "huhu";
        System.out.println(zeichenkette);
    }
}
