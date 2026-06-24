public class Array {
    static void main(String[] args) {
        System.out.println("Übung 4 - Durchschnitt\n");
        /*
        Erstelle ein Array von double-Werten, z.B.: {2.5, 3.6, 1.8, 4.2}.
        Berechne den Durchschnitt der Werte.
        Gib den Durchschnitt aus.
        */

        // - [x] Array mit double Werten erstellen
        // - [x] Schleife über alle Elemente des Arrays
        // - [x] Summe der Werte berechnen
        // - [ ] Summe durch Anzahl der Elemente des Arrays teilen

        double[] temperaturen = {24.2, 22.8, 32.7, 31.5, 27.2, 20.3};

        double summe = 0;

        for (double temperatur : temperaturen) {
            //       0    +      24.2
            //       24.2 +    22.8
            //       47.0 +    32.7
            summe = summe + temperatur;
        }
        //System.out.println(summe);
        double durchschnittswert = summe / temperaturen.length;

        System.out.println("Durchschnittstemperatur: " + durchschnittswert);
    }

}
