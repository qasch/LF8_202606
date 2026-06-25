public class Main {
    static void main(String[] args) {
        // Objekt der Klasse Eissorte erzeugen
        Eissorte vanille = new Eissorte("Vanille", 100, true);
        vanille.gibNameUndPreisAus();

        Eissorte schoko = new Eissorte("Schoko", 150, true);
        schoko.gibNameUndPreisAus();

        Eissorte standard = new Eissorte();
        standard.gibNameUndPreisAus();

        Eissorte erdbeer = new Eissorte("Erdbeer");
        erdbeer.gibNameUndPreisAus();
    }
}
