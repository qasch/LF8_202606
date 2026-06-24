public class Eisautomat {
    /*
    - Automat hat Fächer/Eissorten, die ausgewählt werden können
    - es gibt verschiedene Preise (Eissorte)
    - Auswahl Produkt/Eis
    - Geld einweren/bezahlen
    - Prüfen, ob Eis bezahlt wurde / Betrag prüfen
    - evtl. Wechselgeld zurückgeben (bei zu viel Geld)
    - evtl. Anzeige noch mehr Geld einzuwerfen (bei zu wenig Geld)
    - Eis ausgeben

    0. Eissorten definieren
    1. Eissorten anzeigen
    2. Eissorte auswählen
    3. Preis anzeigen
    4. Geld einwerfen
    5. Betrag prüfen
    5.1 -> zu wenig: 4. Geld einwerfen
    5.2 -> passend: 6. Eis ausgeben
    5.3 -> zu viel: 6. Eis ausgeben UND 7. Wechselgeld auszahlen
    6. Wechselgeld berechnen
    7. Eis ausgeben
    8. Wechselgeld auszahlen

    1. zeigeEissortenAn()   // inkl. Preis
    2. waehleEissorteAus()  // -> später
    3. geldEinzahlen()
    4. prüfeBetrag()
    5. berechneWechselgeld()
    6. gibEisAus()
    7. gibWechselgeldAus()
     */
    static double eingezahlterBetrag = 0.0;
    static double preis = 1.5;

    static void main(String[] args) {
        zeigeEissortenAn();
        betragAnzeigen();
        pruefeBetrag();
        geldEinzahlen(1.0);
        betragAnzeigen();
        pruefeBetrag();
        geldEinzahlen(2.0);
        betragAnzeigen();
        pruefeBetrag();
    }

    // Definition der Funktion
    // wir sagen also, was beim Aufruf der 
    static void zeigeEissortenAn() {
        System.out.println("Vanille - " + preis);
    }

    // Funktion mit Paramenter (double betrag)
    static void geldEinzahlen(double betrag) {
        eingezahlterBetrag = eingezahlterBetrag + betrag;
    }

    static void betragAnzeigen() {
        System.out.println("Eingezahlter Betrag: " + eingezahlterBetrag);
    }

    static void pruefeBetrag() {
        if(eingezahlterBetrag > preis) {
            System.out.println("zu viel");
        } else if(eingezahlterBetrag < preis) {
            System.out.println("zu wenig");
        } else {
            System.out.println("passend");
        }
    }

}
