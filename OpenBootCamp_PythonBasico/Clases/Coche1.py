class Coche1:

    def __init__(self, gasolina):
        self.gasolina = gasolina
        print("Tenemos", gasolina, "Litros")

    def arrancar(self):
        if self.gasolina > 0:
            print("Arranca")
        else:
            print("No arranca")

    def conducir(self):
        if self.gasolina > 0:
            self.gasolina -= 1
            print("Quedan", self.gasolina, "Litros")
        else:
            print("No se mueve")


c = Coche1(0)
c.arrancar()
c.conducir()
c.conducir()
c.conducir()
