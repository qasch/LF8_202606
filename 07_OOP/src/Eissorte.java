public class Eissorte {
    // Attribute - Eigenschaften
    // -> es gibt diese Attribute, jedes Objekt hat diese Eigenschaften
    // -> jedes Objekt hat aber andere, unterschiedliche konkrete Ausprägungen dieser Attribute
    private String sorte;
    private String farbe;
    private int preis;
    private boolean istVerfuegbar;

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
        this.farbe = "weiss";
    }

    // Konstruktor wird überladen
    // muss sich in der Parameterliste unterscheiden
    Eissorte(String sorte) {
        this.sorte = sorte;
        this.preis = 150;
        this.istVerfuegbar = true;
        this.farbe = "rot";
    }

    Eissorte(String sorte, int preis, boolean istVerfuegbar, String farbe) {
        this.sorte = sorte;
        this.setPreis(preis);
        this.istVerfuegbar = istVerfuegbar;
        this.farbe = farbe;
    }

    // getter und setter
    // Getter - Werte der Attribute auslesen
    public String getSorte() {
        return this.sorte;
    }

    public String getFarbe() {
        return this.farbe;
    }

    public int getPreis() {
        return this.preis;
    }

    // Setter
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setPreis(int preis) {
        if(preis > 0) {
            this.preis = preis;
        }
    }

    String formatierePreis() {
        return this.preis + " Euro";
    }

    // Methoden - Funktionalitäten
    void gibNameUndPreisAus() {
        String sorte = "lokale Sorte";
        System.out.println("Ich bin die Sorte " + this.sorte + ", koste " +
                this.formatierePreis() + " bin " + this.farbe + " und bin verfügbar: " + this.istVerfuegbar);
    }
}
