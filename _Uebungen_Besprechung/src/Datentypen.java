public class Datentypen {
    static void main(String[] args) {
        // Übung 1
        System.out.println("Übung 2:");
        System.out.println();
        int ganzeZahl1 = 15;
        int ganzeZahl2 = 20;
        int summe = ganzeZahl1 + ganzeZahl2;    // + -> Additionsoperator

        System.out.println(summe);

        System.out.println("Übung 3:");
        System.out.println();

        String name = "Kai";

        int alter = 47;
        double groesse = 1.83;
        boolean istSchueler = false;

        System.out.println("Mein Name ist " + name);   // + -> Konkatenationsoperator
        String ausgabe = "Mein Name ist " + name;
        System.out.println(ausgabe);   // + -> Konkatenationsoperator



        System.out.println("Mein Alter ist " + alter);    // Methode
        //String ausgabeAlter = "Mein Alter ist " + alter;  // Variable
        //System.out.println(ausgabeAlter);
        System.out.println("Ich bin " + groesse + "m gross");  // implizites Casting
        System.out.println(groesse);
        System.out.println(istSchueler);

        //System.out.println(alter + groesse);
        System.out.println("Mein Name ist " + name + ",\nich " +
                "bin " + alter + " Jahre alt,\n" + groesse +
                "m gross und Schüler: " + istSchueler);

        System.out.println("Übung 4");
        System.out.println();
        double doubleZahl = 45.78;
        System.out.println(doubleZahl);
        int intDouble = (int) doubleZahl;   // explizites Casting
        System.out.println(intDouble);

    }


}
