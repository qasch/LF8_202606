# Unnormalisierten Tabelle in die 3. Normalform überführen

## Ausgangssituation

Ein kleiner Online-Shop verwaltet Bestellungen aktuell in einer einzigen Tabelle.

| Bestellnr | Bestelldatum | Kundennr | Kundenname | Straße | PLZ | Ort | Artikelnr | Artikel | Kategorie | Einzelpreis | Menge |
|-----------|--------------|----------|-------------|---------|------|------|------------|----------|------------|-------------|-------|
| 1001 | 12.05.2026 | K100 | Max Müller | Hauptstraße 5 | 50667 | Köln | A10 | Tastatur | Computerzubehör | 49,90 € | 1 |
| 1001 | 12.05.2026 | K100 | Max Müller | Hauptstraße 5 | 50667 | Köln | A20 | Maus | Computerzubehör | 24,90 € | 2 |
| 1002 | 13.05.2026 | K200 | Lisa Meier | Bahnhofstraße 12 | 44135 | Dortmund | A30 | Monitor | Monitore | 199,00 € | 1 |
| 1003 | 14.05.2026 | K100 | Max Müller | Hauptstraße 5 | 50667 | Köln | A30 | Monitor | Monitore | 199,00 € | 2 |

---

### Aufgabe 1 – Analyse

Betrachte die Tabelle.

Beantworte folgende Fragen:

1. Welche Informationen kommen mehrfach vor?
2. Welche Probleme können dadurch entstehen?
3. Welche Informationen gehören logisch zusammen?

### Aufgabe 2 – Entitäten finden

Überlege, welche eigenständigen Objekte (Entitäten) in der Tabelle vorkommen.

Notiere die Tabellen, die deiner Meinung nach entstehen sollten.

Tipp:

Denke beispielsweise an:

- Kunden
- Artikel
- Bestellungen
- ...

### Aufgabe 3 – Attribute zuordnen

Ordne jeder Tabelle ihre Attribute zu.

Beispiel:

| Tabelle | Attribute |
|----------|-----------|
| Kunde | ? |
| Artikel | ? |


### Aufgabe 4 – Primärschlüssel festlegen

Lege für jede Tabelle einen geeigneten Primärschlüssel fest.

### Aufgabe 5 – Fremdschlüssel ergänzen

Überlege,

- welche Tabellen miteinander verbunden werden müssen,
- welche Fremdschlüssel dafür benötigt werden.

### Aufgabe 6 – Beziehungen darstellen

Oft kann es hilfreich sein, sich einen schematischen Überblick über die Datenbank zu verschaffen.

Zeichne ein einfaches ER-Diagramm oder skizziere die Beziehungen.

Beispiel:

```text
Kunde
   │
   │
Bestellung
   │
   │
Bestellposition
   │
   │
Artikel
```

### Aufgabe 7 – Normalformen überprüfen

Kontrolliere deinen Entwurf mithilfe der drei Fragen.

#### 1. Normalform

- Enthält jedes Feld genau einen Wert?

#### 2. Normalform

- Gehören alle Attribute vollständig zu ihrer jeweiligen Tabelle?

#### 3. Normalform

- Hängt jedes Attribut direkt vom Primärschlüssel ab?
- Gibt es Attribute, die eigentlich andere Attribute beschreiben (z. B. PLZ → Ort)?

## Zusatzaufgabe

Die Geschäftsleitung möchte zusätzlich den Hersteller jedes Artikels speichern.

Ein Hersteller besitzt:

- Herstellernummer
- Firmenname
- Straße
- PLZ
- Ort

Ein Hersteller kann mehrere Artikel produzieren.

### Aufgabe

Erweitere dein Datenmodell entsprechend.

Überlege insbesondere:

- Welche neue Tabelle wird benötigt?
- Welche Beziehung entsteht?
- Wo wird der Fremdschlüssel gespeichert?

## Hinweise

Stelle dir bei jedem Attribut folgende Fragen:

- Gehört diese Information wirklich zu dieser Tabelle?
- Wird sie mehrfach gespeichert?
- Kann sie an anderer Stelle besser abgelegt werden?
