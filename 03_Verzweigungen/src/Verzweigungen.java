import java.util.Scanner;     // Klasse Scanner importieren

public class Verzweigungen {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // Objekt der Klasse Scanner erzeugen
        System.out.println("Bitte eine Zahl eingeben:");
        int zahl1 = input.nextInt();     // Nutzung der Methode nextInt() der Klasse Scanner

        System.out.println("Bitte eine weitere Zahl eingeben:");
        int zahl2 = input.nextInt();

        input.close();    // Scanner sauber schliessen

        //      false
        if (zahl1 < zahl2) {
            System.out.println("Zahl1 ist kleiner als Zahl2");
        } else if (zahl1 > zahl2) {
            System.out.println("Zahl1 ist groesser als Zahl2");
        } else {
            System.out.println("Beide Zahlen sind gleich gross");
        }

        System.out.println("Ausgabe nach der Verzweigung");
    }
}
