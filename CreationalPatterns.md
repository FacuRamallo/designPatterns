# Factory Method

## El problema
Este patrón de diseño resulta valioso en diversas situaciones.
En el software en el que los productos concretos que se crean se desconocen o no se definen con antelación
diseñar siguiendo el enfoque del patrón Factory suele valer para cualquier software al que se añadan
regularmente clases nuevas acordadas, sobre todo si estas clases tienen que pasar por el mismo proceso
de creación.


## La Solución
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

## Ejercicio


## Ventajas/Incovenientes

## UML
src/Images/factoryMethodUML.png
## Links

# Builder Method

## El problema
Un objeto complejo requiere una inicialización laboriosa, paso a paso, 
de muchos campos y objetos anidados. Normalmente, este código de inicialización 
está sepultado dentro de un monstruoso constructor con una gran 
cantidad de parámetros. O, peor aún: disperso por todo el código cliente. 


## La Solución
-El patrón Builder sugiere que saques el código de construcción del objeto de su propia clase
y lo coloques dentro de objetos independientes llamados constructores.

-El patrón organiza la construcción de objetos en una serie de pasos. 
Para crear un objeto, se ejecuta una serie de estos pasos en un objeto constructor. 
Lo importante es que no necesitas invocar todos los pasos. 
Puedes invocar sólo aquellos que sean necesarios para producir 
una configuración particular de un objeto.

## Analogía de la vida real


## Ejercicio


## Ventajas
-Puedes construir objetos paso a paso, aplazar pasos de la construcción o ejecutar pasos de forma recursiva.
-Puedes reutilizar el mismo código de construcción al construir varias representaciones de productos.
-Principio de responsabilidad única. Puedes aislar un código de construcción complejo de la lógica de negocio del producto.

## Incovenientes
-La complejidad general del código aumenta, ya que el patrón exige la creación de varias clases nuevas.


## UML
https://refactoring.guru/images/patterns/diagrams/builder/example-es.png
## Links

