public class Casting {
    static void main(String[] args) {
        // Übung 1
        System.out.println();
        System.out.println("Übung 1");
        System.out.println();
        double kommaZahl = 15.75;
        int ganzeZahl = (int) kommaZahl;
        System.out.println(kommaZahl);
        System.out.println(ganzeZahl);

        // Übung 2
        byte myByte = 101;
        short myShort = (short) myByte;
        System.out.println(myShort);
        int myInt = (int) myShort;
        System.out.println(myInt);
        double myDouble = (double) myInt;
        System.out.println(myDouble);

        // Übung 3
        System.out.println();
        System.out.println("Übung 3");
        System.out.println();
        float myFloat = 12345.6789f;
        System.out.println(myFloat);
        long myLong = (long) myFloat;
        System.out.println(myLong);
        short otherShort = (short) myLong;
        System.out.println(otherShort);

        System.out.println();
        System.out.println("Übung 4");
        System.out.println();
        double bigDouble = 2.0E20;  // 2.0 * 10^20 -> 2 mit 20 Nullen
        System.out.println(bigDouble);
        int bigInt = (int) bigDouble;
        System.out.println(bigInt);

        System.out.println();
        System.out.println("Übung 6");
        System.out.println();

        String myString = "Hallo";
        System.out.println(myString);
        // Führt zu Fehler:
        //int intString = (int) myString;

        System.out.println();
        System.out.println("Übung 7");
        System.out.println();

        char zeichen = 'A';  // 65 -> 0000000001000001
                             // A  -> 0000000001000001
        System.out.println(zeichen);
        int intChar = zeichen;
        System.out.println(intChar);
        char zeichenZahl = 66;  // zeichen ist ein char
        System.out.println(zeichenZahl);

        System.out.println();
        System.out.println("Übung 8");
        System.out.println();
        byte kleineZahl = 126;
        System.out.println(kleineZahl);
        //kleineZahl = kleineZahl + 1;
        kleineZahl++;   // Inkrement: Wert von kleineZahl (126) wird um 1 erhöht
        System.out.println(kleineZahl); // 127  -> 01111111
        kleineZahl++;   // Inkrement: Wert von kleineZahl (127) wird um 1 erhöht
        System.out.println(kleineZahl); // -128 -> 10000000
        kleineZahl++;   // Inkrement: Wert von kleineZahl (-128) wird um 1 erhöht
        System.out.println(kleineZahl); // -127


    }
}
