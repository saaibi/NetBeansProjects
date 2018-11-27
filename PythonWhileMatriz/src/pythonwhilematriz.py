# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "SAAIBI"
__date__ = "$27/05/2015 07:00:02 PM$"

if __name__ == "__main__":
    print "Matriz"
persona = []
n=1
while n<=2:
    nombre = raw_input("nombre: ")
    apellido = raw_input(" apellido: ")
    cedula = raw_input("cedula: ")
    persona.append ([apellido,nombre,cedula])
    n+=1
for i in range (len(persona)):
    print persona[i]