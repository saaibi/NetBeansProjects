# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "SAAIBI"
__date__ = "$27/05/2015 07:13:44 PM$"

if __name__ == "__main__":
    print "Def 02"
def muntiplicar (cadena,n=1):
    print cadena * n
muntiplicar("hola\n"*10)
funcion = muntiplicar

print funcion("saludo\n",5)