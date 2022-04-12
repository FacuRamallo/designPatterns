#Signleton

##El problema
En sistemas que muchos clientes usan una clase se crean demasiadas instancias.

1- Se asegura que una clase solamente tenga una instancia.

2- Provee acceso global a la misma instancia.

##La Solución
- Crear un constructor privado que prevenga la creación con new
- Crear un método estático que devuelva una instancia de la misma clase.
- Asegurar dde que si ya existe una instancia el método estático me devuelva esa misma.

## Analogía de la vida real
Tenemos un sistema con muchas clases cliente que necesitan imprimir con una impresora (única).

##Ejercicio
-Crear una impresora única
-Comprobar que si varios clientes imprimen, el número de impresiones.

##Ventajas/Incovenientes

##UML

##Links
