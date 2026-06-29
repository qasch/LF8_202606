public class Milchspeiseeis extends Eissorte implements Schmelzbar {
    private int fettanteil;
    private boolean enthaeltLaktose;

    public Milchspeiseeis(String sorte, int preis, boolean istVerfuegbar, String farbe, int fettanteil, boolean enthaeltLaktose) {
        //super.sorte = sorte;
        //super.preis = preis;
        //super.istVerfuegbar = istVerfuegbar;
        //super.farbe = farbe;
        super(sorte, preis, istVerfuegbar, farbe);
        this.fettanteil = fettanteil;
        this.enthaeltLaktose = enthaeltLaktose;
    }

    public int getFettanteil() {
        return this.fettanteil;
    }

    public boolean getEnthaeltLaktose() {
        return this.enthaeltLaktose;
    }

    // Methode der Elternklasse überschreiben
    @Override
    protected void gibInformationenAus() {
        System.out.println("Ich bin die Sorte " + super.sorte + ", koste " +
                super.formatierePreis() + " bin " + super.farbe + " habe eine Fettanteil von " +
                this.fettanteil + "% und enthalte Laktose: " + this.enthaeltLaktose);
    }

    @Override
    public void schmelzen() {
        System.out.println(getSorte() + " der Klasse Milchspeiseeis schmilzt");
    }
}
