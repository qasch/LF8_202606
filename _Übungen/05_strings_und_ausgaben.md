# Übungen: Strings und Ausgaben in Java

## Übung 1: Begrüßung mit String

Schreibe ein Programm, das einen Namen in einer `String`-Variable speichert und eine Begrüßung ausgibt.

1. Erstelle eine Variable `name` vom Typ `String`.
2. Weise der Variable einen Namen zu, z. B. `"Max"`.
3. Gib folgenden Text auf der Konsole aus:

```text
Hallo Max!
```

---

## Übung 2: Strings verketten

Schreibe ein Programm, das mehrere `String`-Variablen zu einem Satz zusammensetzt.

1. Erstelle drei Variablen:
   - `vorname`
   - `nachname`
   - `beruf`
2. Weise den Variablen passende Werte zu.
3. Erstelle daraus einen vollständigen Satz.
4. Gib den Satz auf der Konsole aus.

---

## Übung 3: Strings und Zahlen kombinieren

1. Erstelle folgende Variablen:
   - `name` vom Typ `String`
   - `alter` vom Typ `int`
   - `groesse` vom Typ `double`
2. Weise den Variablen passende Werte zu.
3. Gib die Informationen als zusammenhängenden Text aus.

---

## Übung 4: Verschiedene Ausgabemöglichkeiten

1. Erstelle folgende Variablen:

```java
String produkt = "Tastatur";
double preis = 49.99;
int anzahl = 2;
```

2. Gib die Daten zuerst mit `System.out.println()` und String-Verkettung aus.
3. Gib danach alles in einer Zeile mit `System.out.print()` aus.
4. Gib die Daten anschließend mit `System.out.printf()` formatiert aus.

---

## Übung 5: Formatierte Ausgabe mit printf

1. Erstelle folgende Variablen:
   - `artikel` vom Typ `String`
   - `einzelpreis` vom Typ `double`
   - `menge` vom Typ `int`
2. Berechne den Gesamtpreis.
3. Gib die Rechnung mit `System.out.printf()` aus.
4. Formatiere Preise auf zwei Nachkommastellen.

---

## Übung 6: String-Methoden verwenden

1. Erstelle eine Variable:

```java
String text = "Java ist interessant";
```

2. Gib folgende Informationen aus:
   - Länge des Strings mit `.length()`
   - Text in Großbuchstaben mit `.toUpperCase()`
   - Text in Kleinbuchstaben mit `.toLowerCase()`
   - Ob der Text das Wort `"Java"` enthält mit `.contains()`

---

## Übung 7: Zeichen und Teilstrings

1. Erstelle eine Variable:

```java
String wort = "Programmierung";
```

2. Gib aus:
   - das erste Zeichen
   - das fünfte Zeichen
   - die ersten sieben Zeichen
   - den Teilstring `"gramm"`

---

## Übung 8: Vergleich von Strings

1. Erstelle zwei Variablen:

```java
String passwort1 = "geheim";
String passwort2 = "geheim";
```

2. Vergleiche die beiden Strings mit `.equals()`.
3. Gib aus, ob die Passwörter gleich sind.
4. Ändere eines der Passwörter und beobachte das Ergebnis.

---

## Übung 9: String.format und formatted

1. Erstelle folgende Variablen:

```java
String name = "Lisa";
int punkte = 87;
double durchschnitt = 1.75;
```

2. Erzeuge einen formatierten String mit `String.format()`.
3. Gib den String aus.
4. Erzeuge dieselbe Ausgabe zusätzlich mit `.formatted()`.

---

## Übung 10: Mini-Steckbrief

1. Erstelle Variablen für:
   - Vorname
   - Nachname
   - Alter
   - Wohnort
   - Lieblingssprache
2. Gib den Steckbrief sauber formatiert auf der Konsole aus.
3. Verwende dabei mindestens:
   - eine Ausgabe mit `System.out.println()`
   - eine String-Verkettung mit `+`
   - eine formatierte Ausgabe mit `System.out.printf()`
