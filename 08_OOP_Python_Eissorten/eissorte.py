class Eissorte:

    # Initializer ("Konstruktor")
    def __init__(self, sorte, farbe, preis, ist_verfuegbar):
        self.sorte = sorte
        self.farbe = farbe
        self.__preis = preis
        self.ist_verfuegbar = ist_verfuegbar

    def gib_informationen_aus(self):
        print(f"Sorte: {self.sorte}")
        print(f"Farbe: {self.farbe}")
        print(f"Preis: {self.__preis}")
        print(f"Verfügbar {self.ist_verfuegbar}")
        print()

        # Klassendefinition ist hier zu Ende




