Las clases genéricas encapsulan operaciones que no son específicas de un tipo de datos determinado. 
El uso más común de las clases genéricas es con colecciones como listas vinculadas, tablas hash, pilas, colas y árboles, entre otros.
Normalmente, crea clases genéricas empezando con una clase concreta existente, y cambiando tipos en parámetros de tipo de uno en uno hasta que alcanza el equilibrio óptimo de generalización y facilidad de uso.
Puede trabajar con diferentes tipos de datos sin necesidad de definir específicamente qué tipo de dato utilizará. Esto se logra mediante el uso de parámetros de tipo (como <T>, <E>, <K, V>) en su declaración.

Referencias:
https://learn.microsoft.com/es-es/dotnet/csharp/programming-guide/generics/generic-classes