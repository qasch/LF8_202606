public class Main {
    static void main(String[] args) {
        // Objekt der Klasse Eissorte erzeugen
        Eissorte vanille = new Eissorte("Vanille", 100, true, "gelblich");
        vanille.gibNameUndPreisAus();

        Eissorte schoko = new Eissorte("Schoko", -150, true, "braun");
        schoko.gibNameUndPreisAus();

        Eissorte standard = new Eissorte();
        standard.gibNameUndPreisAus();

        Eissorte erdbeer = new Eissorte("Erdbeer");
        erdbeer.gibNameUndPreisAus();

        System.out.println(erdbeer.getPreis());

        erdbeer.setPreis(-100);
        erdbeer.gibNameUndPreisAus();

        //erdbeer.preis = 10;
        //erdbeer.farbe = "blau";
    }
}
