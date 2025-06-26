import time

# balance inicial
saldo = int(1000)

# animacion para cierre de cajero
progreso = ["_"] * 5

def mostra_menu():
    print("\n__Cajero Automatico__")
    print("1.Consultar saldo")
    print("2.Depositar saldo")
    print("3.Retirar saldo")
    print("0.Salir")

def retirar_saldo():
    global saldo
    try:
        retiro = int(input("\nCaunto quieres sacar: "))
        if retiro > saldo:
            print("\nNo tienes saldo suficiente")
        else:
            saldo -= retiro
    except ValueError:
        print("Entrada inválida. Usa solo números.")

def depositar_saldo():
    global saldo
    deposito = int(input("\nCuanto quieres depositar: "))
    if deposito > 0:
        saldo += deposito
    else:
        print("\nDeposito incorrecto")

def consultar_saldo():
    print(f"\nEl saldo actual es: {saldo}")

while True:
    mostra_menu()
    opcion = input("\nElige una opcion ")
    if opcion == "1":
        consultar_saldo()
    elif opcion == "2":
        depositar_saldo()
    elif opcion == "3":
        retirar_saldo()
    elif opcion == "0":
        print("Saliendo")
        for i in progreso:
            print(i, end="", flush=True)
            time.sleep(0.9)
        print("\n")
        time.sleep(1)
        print("Gracias por su visita")
        break
    else :
        print("Opcion invalida, prueba otra vez")

