class Coche:
    #Atributos
    def __init__(self, gasolina):
        self.gasolina = gasolina
    #Metodos
    def imprimir_gasolina(self):
        print(f"Nivel de gasolina: {self.gasolina}")

    def arrancar(self):
        if self.gasolina > 0:
            print("¡El coche arranca!")
        else:
            print("No hay gasolina suficiente para arrancar el coche")

    def conducir(self, distancia):
        if self.gasolina >= distancia / 10:
            self.gasolina -= distancia / 10
            print(f"Conduciendo {distancia} km...")
            self.imprimir_gasolina()
        else:
            print("No hay suficiente gasolina para conducir esa distancia")

#Instancia de clase y uso de metodos
mi_coche = Coche(3)  # Nivel de gasolina: 5
mi_coche.arrancar()  # ¡El coche arranca!
mi_coche.conducir(2)  # Conduciendo 50 km...





