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

        Eissorte standard = new Eissorte();
        //standard.gibInformationenAus();

        Milchspeiseeis vanille = new Milchspeiseeis("Vanille", 100, true,  "gelblich", 15, true);
        //vanille.gibInformationenAus();

        // Array sortiment
        Eissorte[] sortiment = new Eissorte[2];
        sortiment[0] = vanille;
        sortiment[1] = standard;

        for (Eissorte eis : sortiment) {
            eis.gibInformationenAus();
        }






    }
}
