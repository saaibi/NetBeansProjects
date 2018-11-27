# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
# Autor: Juan Velasquez
#    if i > 5 or i < 1:
#            print "La opción digitada no es válida"
#            print ""
#            a = True
#        else: 
nombre = raw_input("Por favor ingrese su nombre\n")
print "Bienvenido al juego: "
import random
a = True
jugador = 0
maquina = 0
while a:    
    opciones = ["Piedra", "Papel", "Tijera", "Lagarto", "Spock"]
    for i in range(5):
        print str(i+1)+ ") " + opciones[i]
    print "Escoja una opcion: "
    i = int(raw_input())
    t = random.randint(1 , 5)
    print "opcion de la Maquina: "
    print (t)
    if t == i:
        print "Empate"
    elif i == 1 and t == 3 or i == 1 and t == 4 or i == 2 and t == 1 or i == 2 and t == 5 or i == 3 and t == 2 or i == 3 and t == 4 or i == 4 and t == 2 or i == 4 and t == 5or i == 5 and t == 1 or i == 5 and t == 3:
        print "Gano"
        jugador = jugador + 1
        print "Usted ha escojido: ", i, " La opcion de la maquina fue: ", t       
    elif i == 1 and t == 2 or i == 1 and t == 5or i == 2 and t == 3 or i == 2 and t == 4or i == 3 and t == 1 or i == 3 and t == 5or i == 4 and t == 1 or i == 4 and t == 3or i == 5 and t == 2 or i == 5 and t == 4:
        maquina = maquina + 1
        print "Perdio"
        print "Usted ha escojido: ", i, " La opcion de la maquina fue: ", t
    print "Puntaje:"
    print "Jugador: ", jugador
    print "Maquina: ", maquina
    restart = raw_input ("Quieres jugar de nuevo? ")
    restart = restart.lower()
    if restart == "si":
       print ""
       a = True
    else:
       a = False
       print "Gracias por jugar"