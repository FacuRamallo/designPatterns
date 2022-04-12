#Factory Method

##El problema
Este patrón de diseño resulta valioso en diversas situaciones.
En el software en el que los productos concretos que se crean se desconocen o no se definen con antelación
diseñar siguiendo el enfoque del patrón Factory suele valer para cualquier software al que se añadan
regularmente clases nuevas acordadas, sobre todo si estas clases tienen que pasar por el mismo proceso
de creación.


##La Solución
-The Factory Method pattern suggests that you replace direct
object construction calls (using the new operator) with calls
to a special factory method.
-you can override the factory
method in a subclass and change the class of products being
created by the method.
-There’s a slight limitation though: subclasses may return different
 types of products only if these products have a common
 base class or interface.
-the factory method in the base
 class should have its return type declared as this interface
## Analogía de la vida real
This example illustrates how the Factory Method can be used
for creating cross-platform UI elements without coupling the
client code to concrete UI classes.

##Ejercicio


##Ventajas/Incovenientes

##UML
src/Images/factoryMethodUML.png
##Links
