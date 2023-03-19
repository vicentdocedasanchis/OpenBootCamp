class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def presentarse(self):
        print(f"Hola, mi nombre es {self.nombre} y tengo {self.edad} años.")


p = Persona("Juan", 25)
p.presentarse()  # Salida: "Hola, mi nombre es Juan y tengo 25 años."
