public class Fruchteis extends Eissorte implements Schmelzbar {
    private int fruchtAnteil;
    private boolean istVegan;

    public Fruchteis(String sorte, int preis, boolean istVerfuegbar, String farbe, int fruchtAnteil, boolean istVegan) {
        super(sorte, preis, istVerfuegbar, farbe);
        this.fruchtAnteil = fruchtAnteil;
        this.istVegan = istVegan;
    }

    @Override
    protected void gibInformationenAus() {
        //super.gibInformationenAus();
        System.out.println("Ich bin die Sorte " + super.sorte + ", koste " +
                super.formatierePreis() + " bin " + super.farbe);
        System.out.println("Zusätzlich habe ich einen Fruchtanteil von " + this.fruchtAnteil +
                " und bin vegan: " + this.istVegan);
    }

    @Override
    public void schmelzen() {
        System.out.println(getSorte() + " der Klasse Fruchteis schmilzt");
    }
}
