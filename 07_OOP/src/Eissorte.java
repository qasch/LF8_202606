public class Eissorte {
    // Attribute - Eigenschaften
    // -> es gibt diese Attribute, jedes Objekt hat diese Eigenschaften
    // -> jedes Objekt hat aber andere, unterschiedliche konkrete Ausprägungen dieser Attribute
    String sorte;
    int preis;
    boolean istVerfuegbar;

    // Konstruktor
    // Standardkonstruktor - ist so in jeder Klasse enthalten
    // solange wir keinen eigenen Konstruktor definieren
    //Eissorte() {
    //
    //}

    Eissorte() {
        this.sorte = "Standard";
        this.preis = 100;
        this.istVerfuegbar = true;
    }

    // Konstruktor wird überladen
    // muss sich in der Parameterliste unterscheiden
    Eissorte(String sorte) {
        this.sorte = sorte;
        this.preis = 100;
        this.istVerfuegbar = true;
    }

    Eissorte(String sorte, int preis, boolean istVerfuegbar) {
        this.sorte = sorte;
        this.preis = preis;
        this.istVerfuegbar = istVerfuegbar;
    }

    // Methoden - Funktionalitäten
    void gibNameUndPreisAus() {
        System.out.println("Ich bin die Sorte " + this.sorte + ", koste " +
                this.preis + " und bin verfügbar: " + this.istVerfuegbar);
    }
}
