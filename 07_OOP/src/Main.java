public class Main {
    static void main(String[] args) {
        // Objekt der Klasse Eissorte erzeugen
        //Eissorte vanille = new Eissorte("Vanille", 100, true, "gelblich");
        //vanille.gibNameUndPreisAus();

        //Eissorte schoko = new Eissorte("Schoko", -150, true, "braun");
        //schoko.gibNameUndPreisAus();

        //Eissorte standard = new Eissorte();
        //standard.gibNameUndPreisAus();

        //Eissorte erdbeer = new Eissorte("Erdbeer");
        //erdbeer.gibNameUndPreisAus();

        //System.out.println(erdbeer.getPreis());

        //erdbeer.setPreis(-100);
        //erdbeer.gibNameUndPreisAus();

        //erdbeer.preis = 10;
        //erdbeer.farbe = "blau";

        //Eissorte standard = new Eissorte();

        Milchspeiseeis vanille = new Milchspeiseeis("Vanille", 100, true,  "gelblich", 15, true);
        Milchspeiseeis schoko = new Milchspeiseeis("Schoko", 150, true, "dunkelstbraun", 20, false);

        Fruchteis erdbeer = new Fruchteis("Erdbeer", 120, true, "rot", 20, true);
        Fruchteis zitrone = new Fruchteis("Zitrone", 100, true, "weiss", 10, true);

        // Array sortiment
        Eissorte[] sortiment = new Eissorte[4];
        sortiment[0] = vanille;
        sortiment[1] = schoko;
        sortiment[2] = erdbeer;
        sortiment[3] = zitrone;

        for (Eissorte eis : sortiment) {
            eis.gibInformationenAus();
        }

        erdbeer.schmelzen();
        schoko.schmelzen();







    }
}
