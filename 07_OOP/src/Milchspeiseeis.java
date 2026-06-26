public class Milchspeiseeis extends Eissorte {
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
    protected void gibInformationenAus() {
        System.out.println("Ich bin die Sorte " + this.sorte + ", koste " +
                this.formatierePreis() + " bin " + this.farbe + " habe eine Fettanteil von " +
                this.fettanteil + "% und enthalte Laktose: " + this.enthaeltLaktose);
    }
}
