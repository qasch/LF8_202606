from fruchteis import Fruchteis
from milchspeiseeis import Milchspeiseeis

# Objekt der Klasse Eissorte erzeugen und initialisieren
vanille = Milchspeiseeis("Vanille", "gelblich", 100, True, 10, True)
erbdbeer = Fruchteis(23.456, "rot", 120, True, 40, True)

print(vanille)
vanille._Eissorte__preis = 20
print(vanille._Eissorte__preis)
vanille.gib_informationen_aus()

print(erbdbeer)
erbdbeer.gib_informationen_aus()
