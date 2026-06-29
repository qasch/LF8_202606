from eissorte import Eissorte

# Klasse Fruchteis erbt von / erweitert Eissorte
# Python kennt kein "extends"
class Fruchteis(Eissorte):

    def __init__(self, sorte, farbe, preis, ist_verfuegbar, fruchtanteil, ist_vegan):
        super().__init__(sorte, farbe, preis, ist_verfuegbar)
        self.fruchtanteil = fruchtanteil
        self.ist_vegan = ist_vegan

    def gib_informationen_aus(self):
        super().gib_informationen_aus()
        print(f"Fruchtanteil: {self.fruchtanteil}")
        print(f"Veagn: {self.ist_vegan}")
        print()
