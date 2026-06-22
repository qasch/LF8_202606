public class Verzweigungen {
    /*
    - [x] main Methode erstellen
    - [x] Variable mit korrektem Benutzername erstellen (String)
    - [x] Variable mit korrektem Passwort erstellen (String)
    - [x] Variable für zu prüfenden Benutzername erstellen (String)
    - [x] Variable für zu prüfendes Passwort erstellen (String)
    - [x] if-Bedingung zur Überprüfung:
      [x] - Prüfen, ob korrekte und zu prüfende Variablen gleich sind
      [x] - wir müsen beide Bedingugnen auf einmal prüfen (wie?) -> logisches UND
    - [x] wenn beide korrekt, "Login erfolgreich" ausgeben
    - [x] wenn nicht korrekt "Login fehlgeschlagen" ausgeben
    - [x] Methode .equals() der Klasse String zum Vergleich nutzen
     */

    static void main(String[] args) {
        String benutzernameKorrekt = "gretl";
        String benutzernameZuPruefen = "gretl";
        String passwortKorrekt = "passwort";
        String passwortZuPruefen = "passwort";

        // Folgende Lösung funktioniert zwar, ist aber nicht wirklich
        // elegant, da die Zeilen 26 und 28 redundant sind.
        // Dies führt dazu, dass wir aufgeblähten Code haben,
        // bei einer Änderung diese an mehreren Stellen machen müssen etc.
        /*
        if (benutzernameZuPruefen.equals(benutzernameKorrekt)) {
                if (passwortZuPruefen.equals(passwortKorrekt)) {
                    System.out.println("Login erfolgreich");
                } else {
                    System.out.println("Login fehlgeschlagen");
                }
        } else {
            System.out.println("Login fehlgeschlagen");
        }
        */

        // Dies ist die deutlich bessere Lösung mit einer logischen UND-Verknüpfung
        // Logisches UND (&&)
        // true && true   ->  true
        // true && false  ->  false
        // false && true  ->  false
        // false && false ->  false
        //
        //                 true                               &&                   true
        if (benutzernameZuPruefen.equals(benutzernameKorrekt) && passwortZuPruefen.equals(passwortKorrekt)) {
                System.out.println("Login erfolgreich");
        } else {
            System.out.println("Login fehlgeschlagen");
        }
    }
}
