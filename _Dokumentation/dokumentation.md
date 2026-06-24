# Dokumentation Java

## Datentypen

### Primitive Datentypen

Java hat 8 primitive Datentypen, die in vier Kategorien unterteilt werden können.

Primitive Datentypen werden direkt im Stack (ein besonders schneller Bereich des Hauptspeichers) abgelegt, bzw. dort der jeweilige Speicherplatz reserviert.

### Ganzzahlige Datentypen

Je mehr Bit ein Datentyp hier hat, desto grössere Werte können abgelegt werden. Wissen wir, dass die Werte eine gewisse Grenze nicht überschreiten werden, können wir mit dem passenden Datentyp Speicher sparen.

#### byte
- **Größe:** 8 Bit (1 Byte)
- **Wertebereich:** -128 bis 127
- **Standardwert:** 0
- **Verwendung:** Speicherung von kleinen Zahlen, z.B. bei großen Arrays wo Speicher wichtig ist

```java
byte alter = 25;
byte temperatur = -10;
```

#### short
- **Größe:** 16 Bit (2 Bytes)
- **Wertebereich:** -32.768 bis 32.767
- **Standardwert:** 0
- **Verwendung:** Seltener verwendet, wenn int zu groß wäre

```java
short jahr = 2024;
short hoehe = 1500;
```

#### int
- **Größe:** 32 Bit (4 Bytes)
- **Wertebereich:** -2.147.483.648 bis 2.147.483.647
- **Standardwert:** 0
- **Verwendung:** Standard für Ganzzahlen, am häufigsten verwendet

```java
int einwohner = 1000000;
int punktzahl = 42;
```

#### long
- **Größe:** 64 Bit (8 Bytes)
- **Wertebereich:** -9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807
- **Standardwert:** 0L
- **Verwendung:** Sehr große Zahlen, Zeitstempel, große Berechnungen

```java
long weltbevoelkerung = 8000000000L;
long millisekunden = System.currentTimeMillis();
```

>[!NOTE]
> Bei long-Literalen muss ein `L` am Ende stehen.

### Gleitkommazahlen

Je mehr Bit desto grösser ist einmal der Wertebereich, vor allem aber auch die Genauigkeit bzw. Anzahl der Nachkommastellen.

#### float
- **Größe:** 32 Bit (4 Bytes)
- **Wertebereich:** Ca. ±3.4 × 10³⁸ (6-7 Dezimalstellen Genauigkeit)
- **Standardwert:** 0.0f
- **Verwendung:** Kommazahlen mit einfacher Genauigkeit, wenn Speicher wichtig ist

```java
float preis = 19.99f;
float pi = 3.14159f;
```

>[!NOTE]
> Bei float-Literalen muss ein `f` am Ende stehen!

#### double
- **Größe:** 64 Bit (8 Bytes)
- **Wertebereich:** Ca. ±1.7 × 10³⁰⁸ (15 Dezimalstellen Genauigkeit)
- **Standardwert:** 0.0
- **Verwendung:** Standard für Kommazahlen, präzisere Berechnungen

```java
double pi = 3.141592653589793;
double ergebnis = 12.5 / 3.0;
```

### Zeichen

#### char
- **Größe:** 16 Bit (2 Bytes)
- **Wertebereich:** 0 bis 65.535 (Unicode-Zeichen)
- **Standardwert:** '\u0000' (Null-Zeichen)
- **Verwendung:** Einzelne Zeichen speichern

```java
char buchstabe = 'A';
char ziffer = '7';
char unicode = '\u0041';  // Unicode für 'A'
```

**Hinweis:** Zeichen werden in einfachen Anführungszeichen geschrieben.

### Boolesche Werte

#### boolean
- **Größe:** Nicht festgelegt (JVM-abhängig, meist 1 Bit)
- **Wertebereich:** `true` oder `false`
- **Standardwert:** false
- **Verwendung:** Wahrheitswerte, Bedingungen, Flags

```java
boolean istAktiv = true;
boolean hatBestanden = false;
boolean istGroesser = (5 > 3);  // true
```

### Vergleichstabelle

| Typ | Größe | Wertebereich | Standardwert | Beispiel |
|-----|-------|--------------|--------------|----------|
| byte | 8 Bit | -128 bis 127 | 0 | `byte b = 100;` |
| short | 16 Bit | -32.768 bis 32.767 | 0 | `short s = 1000;` |
| int | 32 Bit | -2³¹ bis 2³¹-1 | 0 | `int i = 42;` |
| long | 64 Bit | -2⁶³ bis 2⁶³-1 | 0L | `long l = 1000L;` |
| float | 32 Bit | ±3.4 × 10³⁸ | 0.0f | `float f = 3.14f;` |
| double | 64 Bit | ±1.7 × 10³⁰⁸ | 0.0 | `double d = 3.14;` |
| char | 16 Bit | 0 bis 65.535 | '\u0000' | `char c = 'A';` |
| boolean | ~1 Bit | true/false | false | `boolean b = true;` |




## Casting

### Implizites Casting (Widening Conversion)
Das passiert automatisch, wenn wir von einem "kleineren" zu einem "größeren" Datentyp konvertieren. Java macht das selbst, weil dabei keine Informationen verloren gehen:

```java
int ganzeZahl = 42;
double kommaZahl = ganzeZahl;  // automatisch von int zu double
```
Die Hierarchie sieht so aus: byte → short → int → long → float → double

### Explizites Casting (Narrowing Conversion)
Das müssen wir selbst angeben, wenn wir von einem "größeren" zu einem "kleineren" Datentyp konvertieren. Hier können Daten verloren gehen:

```java
double kommaZahl = 42.7;
int ganzeZahl = (int) kommaZahl;  // Ergebnis: 42 (Nachkommastellen weg!)
```

## Benutzereingaben mit Scanner

Um Benutzereingaben von der Konsole entgegennehmen zu können, nutzen wir die Klasse `Scanner`, welche importiert werden muss.

In Java stehen die `import` Statements generell ausserhalb der Klasse.

```java
// Klasse Scanner importieren
import java.util.Scanner

public class SomeClass {
    public static void main (String[] args) {
        // Objekt der Klasse Scanner mit Namen input erzeugen
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte einen Namen eingeben: ");
        String name = input.nextLine();  // String einlesen

        System.out.println("Bitte eine Zahl eingeben: ");
        String name = input.nextInt();  // Integer einlesen

        System.out.println("Bitte eine Kommazahl eingeben: ");
        String name = input.nextDouble();  // Double einlesen

        ...
    }
}
```

## Verzweigungen

Mit Verzweigungen können wir den logischen Ablauf eines Programms steuern.

```java
if (bedingung) {
    alles hier in dem Rumpf
    wird ausgeführt falls bedingung wahr/true
}

int zahl1 = 5;
int zahl2 = 7;

if (zahl1 < zahl2) {
    System.out.println("zahl1 ist kleiner als zahl2");
} else if (zahl1 > zahl2) {
    System.out.println("zahl1 ist groesser als zahl2");
} else {
    System.out.println("beide zahlen sind gleich gross");
}
```

Der `else if` Zweig wird nur ausgeführt/geprüft, falls die erste Bedingug `false` ergibt. 

Nur falls sowohl die Bedingug im `if`-Statement als auch die Bedingung im `if else` Statement `false` sind wird der `else` Zweig ausgeführt.

## Logische Operatoren

Durch logische Operatoren lassen sich mehrere Bedingungen/Ausdrücke miteinander verknüpfen, so dass nach der Auswertung ein einzelner Wahrheitswert herauskommt.

### Logisches UND `&&`

| Ausdruck       | Ergebnis |
| -------------- | -------- |
| true && true   | true |
| true && false  |  false |
| false && true  |  false |
| false && false |  false |

### Logische ODER `||`

| Ausdruck       | Ergebnis |
| -------------- | -------- |
| true \|\| true   | true |
| true \|\| false  | true  |
| false \|\| true | true |
| false \|\| false | false |


### NOT `!`

Das *NOT* bzw. die Negation (`!`) ist kein logischer Operator, die Negation ist in vielen Fällen jedoch sehr hilfreich um den passenden Ausdruck zu basteln.

```
(! ausdruck)   -> Ausdruck wird negiert:
(! true)   -> false
(! false)   -> true
```

## Schleifen

### Kopfgesteuerte Schleife

Die Bedingung wird ganz zu Anfang der Schleife geprüft. Solange die Bedingung wahr ist, wird der Rumpf der Schleife ausgeführt.

Es kann also sein, dass die Schleife niemals durchlaufen wird, falls die Bedingung schon anfangs nicht wahr ist.

#### while Schleife

```java
while (bedingung) {      // Kopf der Schleife
    doSomething();       // Rumpf der Schleife
    doSomethingElse();
}

// Ausgabe der Zahlen von 1 bis 10
int zahl = 1;           // Zählvariable
while (zahl <= 10) {    // Bedingung
    System.out.println(zahl);
    //zahl = zahl + 1;
    zahl++;             // Inkrement
}
```

#### for-Schleife / Zählschleife

```java
for (zählvarialbe; bedingung; inkrement) {
    doSomething();       // Rumpf der Schleife
    doSomethingElse();
}

// Ausgabe der Zahlen von 1 bis 10
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

### Fussgesteuerte Schleife

Die Bedingung wird erst nach dem Schleifendurchlauf geprüft. Die Schleife wird also mindestens einmal durchlaufen, auch wenn die Bedingung schon anfangs nicht wahr ist.

```java
do {      
    doSomething();       // Rumpf der Schleife
    doSomethingElse();
} while (bedingung);     // Fuss der Schleife
```

## Arrays

- Arrays sind "Container", die (im Gegensatz zu Variablen) mehrere Werte aufnehmen können (ähnlich wie eine List in Python).
- auch Arrays haben einen Datentyp, können also nur Elemente dieses einen Datentyps aufnehmen.
- Arrays haben eine feste Grösse, die bei der Erstellung angegeben werden muss und im nachhinein nicht mehr geändert werden kann.

### Array Deklaration und Initialisierung

```java
// Deklaration - wir sagen, dass es das Array gibt 
int[] zahlen; 

// Initialisierung (Grösse und Standardwerte festlegen)
zahlen = new int[4];    

// Werte zuweisen (über den Index)
zahlen[0] = 7;
zahlen[1] = 3;
zahlen[2] = 232432;

// Deklaration und Initialisierung in einem Schritt
String[] texte = new String[3];

// Deklaration, Initialisierung und Wertzuweisung in einem Schritt
double[] kommaZahlen = {1.43, 5.77, 123.6789, 0.000000001};
```

### Iteration über Arrays - alle Elemente ausgeben lassen

```java
String[] texte = {"Hallo", "du", "da", "ganz", "weit", "hinten"};

// unelegant, machen wir so nicht:
System.out.println(texte[0]);
System.out.println(texte[1]);
System.out.println(texte[2]);
System.out.println(texte[3]);
System.out.println(texte[4]);
System.out.println(texte[5]);

// besser, mit klassischer for-Schleife:
for (int i = 0; i < texte.length; i++) {
    System.out.println(texte[i]);
}

// noch besser, mit Enhanced-For-Loop / For-Each-Loop
for (String text : texte) {
    System.out.println(text);
}
```










