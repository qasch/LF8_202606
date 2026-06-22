# Übungen: Casting in Java

## Übung 1: Explizites Casting
1. Deklariere eine `double`-Variable mit dem Wert `15.75`.
2. Konvertiere die Variable explizit in eine `int`-Variable.
3. Gib beide Variablen auf der Konsole aus und erläutere den Unterschied.

## Übung 2: Datentypen-Kette
1. Erstelle eine `byte`-Variable mit einem Wert zwischen `0` und `127`.
2. Konvertiere die `byte`-Variable:
   - Zuerst in einen `short`.
   - Dann in einen `int`.
   - Schließlich wieder in einen `double`.
3. Gib alle Variablenwerte nach jeder Konvertierung aus.

## Übung 3: Narrowing Casting mit Verlust
1. Deklariere eine `float`-Variable mit dem Wert `12345.6789`.
2. Konvertiere die Variable explizit in eine `long`-Variable und dann in eine `short`-Variable.
3. Gib die Werte nach jedem Schritt auf der Konsole aus. 
4. Beobachte und erkläre, was mit den Daten passiert.

## Übung 4: Fehler beim Casting
1. Erstelle eine `double`-Variable mit einem sehr großen Wert, z. B. `2.0E20`.
2. Konvertiere diese Variable explizit in einen `int`.
3. Beobachte, was passiert, und versuche zu erklären, warum dies geschieht.

## Übung 5: Wertebereich testen
1. Erstelle eine `long`-Variable mit einem Wert, der außerhalb des Bereichs eines `int` liegt. Recherschiere dazu die Wertebereiche der Primitives in Java.
2. Konvertiere die `long`-Variable explizit in einen `int`.
3. Gib das Ergebnis auf der Konsole aus und erkläre den Effekt.

## Übung 6: Fehlerhafte Konvertierung
1. Schreibe ein Programm, das versucht, eine `String`-Variable in einen `int` zu konvertieren, und beobachte den Fehler.

## Übung 7: Char nach Int
1. Erstelle eine Variable `text` vom Typ `char` und weise ihr den Wert `c` zu.
2. Gib den Wert von `text` auf der Konsole aus.
3. Erstelle eine Variable `intChar` vom Typ `int`, weise ihr aber `text` zu: `int intChar = text;` 
4. Gib den Wert von `intChar` auf der Konsole aus.
5. Erkläre, was hier passiert. Vielleicht hilft es ja, `text` auch noch andere Werte zuzuweisen, z.B. `b` oder `d` um es besser zu verstehen.

## Übung 8: Overflow 
1. Erstelle eine `byte` Variable `kleineZahl` und weise ihr den Wert `126` zu.
2. Erhöhe nun den Wert von `kleineZahl` um 1 mit `kleineZahl = kleineZahl + 1;` bzw. `kleineZahl++`.
3. Gib den Wert von `kleineZahl` auf der Konsole aus.
4. Führe nun die Schritte 2 und 3 nochmal aus und erkläre das Ergebnis.
