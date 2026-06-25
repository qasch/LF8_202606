public class Eissorte {
    // Attribute - Eigenschaften
    // -> es gibt diese Attribute, jedes Objekt hat diese Eigenschaften
    // -> jedes Objekt hat aber andere, unterschiedliche konkrete Ausprägungen dieser Attribute
    String sorte;
    int preis;
    boolean istVerfuegbar;

    // Methoden - Funktionalitäten
    void gibNameUndPreisAus() {
        System.out.println("Ich bin die Sorte " + sorte + " und koste " + preis);
    }
}
