import random

print("__Generador de contrasenas__")

longitud = int(input("\nIntroduce una longitud de contrasena (Recomendacion minima 8 characteres)"))
contrasenaNueva= ""
characters = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
simbolos = ["!", "#", "$", "%", "&", "(", ")", "*", "+", "?"]
numeros = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]

union = characters + simbolos + numeros
random.shuffle(union)

for i in range(0, longitud):
    contrasenaNueva += union[i]

print(contrasenaNueva)

