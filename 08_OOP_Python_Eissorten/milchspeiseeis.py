from eissorte import Eissorte

class Milchspeiseeis(Eissorte):

    def __init__(self, sorte, farbe, preis, ist_verfuegbar, fettanteil, enthaelt_laktose):
        super().__init__(sorte, farbe, preis, ist_verfuegbar)
        self.fettanteil = fettanteil
        self.enthaelt_laktose = enthaelt_laktose


    def gib_informationen_aus(self):
        super().gib_informationen_aus()
        print(f"Fettanteil: {self.fettanteil}")
        print(f"Laktose: {self.enthaelt_laktose}")
        print()
