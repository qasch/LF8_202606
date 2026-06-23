public class Strings {
    static void main(String[] args) {
        System.out.println();
        System.out.println("Übung 6");
        System.out.println();

        String text = "Java ist interessant";

        // Ergebnis in einer Variablen speichern
        // dann Varialbe übergeben
        int laengeString = text.length();
        System.out.println(laengeString);

        // kürzerer Weg ohne Variable
        System.out.println(text.length());

        String textGrossbuchstaben = text.toUpperCase();
        System.out.println(textGrossbuchstaben);

        System.out.println(text.toUpperCase());

        System.out.println(text.contains("Java"));

        System.out.println();
        System.out.println("Übung 6");
        System.out.println();

        System.out.println(text.charAt(0));
    }
}
