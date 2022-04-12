#Abstract Factory

"El patrón de diseño Abstract Factory busca agrupar un conjunto de clases que tiene un funcionamiento en común llamadas familias, las cuales son creadas mediante un Factory"

Para comprender mejor cómo funciona este patrón explicaremos cada componente:

- **Client:** Representa la persona o evento que dispara la ejecución del patrón.
- **AbstractProduct (A, B):** Interfaces que definen la estructura de los objetos para crear familias.
- **ConcreteProduct (A, B):** Clases que heredan de AbstractProduct con el fin de implementar familias de objetos concretos.
- **ConcreteFactory:** Representan las fábricas concretas que servirán para crear las instancias de todas las clases de la familia. En esta clase debe existir un método para crear cada una de las clases de la familia.
- **AbstractFactory:** Define la estructura de las fábricas y deben proporcionar un método para cada clase de la familia.

    

##El problema
- La estructura de Abstract Factory puede resultar muy enredosa, ya que tiene muchos componentes y éstos aparentemente se mezclan entre sí.

##La Solución


## Analogía de la vida real


##Ejercicio


##Ventajas/Inconvenientes


    + Brinda flexibilidad al aislar a las clases concretas.
    + Facilita cambiar las familias de productos.
    – Para agregar nuevos productos se deben modificar tanto las fabricas abstractas como las concretas.

##UML

##Links

