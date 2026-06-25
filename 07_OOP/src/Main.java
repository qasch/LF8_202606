public class Main {
    static void main(String[] args) {
        // Objekt der Klasse Eissorte erzeugen
        Eissorte vanille = new Eissorte();

        //System.out.println(vanille);

        System.out.println("Objektzustand VOR der Zuweisung konkreter Werte für die Attribute:");
        System.out.println(vanille.sorte);
        System.out.println(vanille.preis);
        System.out.println(vanille.istVerfuegbar);

        vanille.sorte = "Vanille";
        vanille.preis = 100;
        vanille.istVerfuegbar = true;

        System.out.println("Objektzustand NACH der Zuweisung konkreter Werte für die Attribute:");
        System.out.println(vanille.sorte);
        System.out.println(vanille.preis);
        System.out.println(vanille.istVerfuegbar);

        System.out.println(vanille.sorte + " - " + vanille.preis);

        Eissorte schoko = new Eissorte();
        schoko.sorte = "Schoko";
        schoko.preis = 150;
        schoko.istVerfuegbar = true;

        System.out.println(schoko.sorte);
        System.out.println(schoko.preis);
        System.out.println(schoko.istVerfuegbar);

        System.out.println(schoko.sorte + " - " + schoko.preis);
        
        vanille.gibNameUndPreisAus();
        schoko.gibNameUndPreisAus();
    }
}
