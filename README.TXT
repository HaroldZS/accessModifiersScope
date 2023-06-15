+---------------------+--------------+-------------+----------+---------------+--------------+
| Modificador de      | Clase Actual | Misma Clase | Subclase | Mismo Paquete | Otro Paquete |
| Acceso              |              |             |          |               |              |
+---------------------+--------------+-------------+----------+---------------+--------------+
| Public              |      Sí      |     Sí      |    Sí    |      Sí       |     Sí       |
+---------------------+--------------+-------------+----------+---------------+--------------+
| Private             |      Sí      |     Sí      |    No    |      No       |     No       |
+---------------------+--------------+-------------+----------+---------------+--------------+
| Protected           |      Sí      |     Sí      |    Sí    |      Sí       |     No       |
+---------------------+--------------+-------------+----------+---------------+--------------+
| Default             |      Sí      |     Sí      |    No    |      Sí       |     No       |
+---------------------+--------------+-------------+----------+---------------+--------------+

Public: El modificador public es el nivel de acceso más alto en Java. Los miembros (atributos, métodos, clases) declarados como públicos son accesibles desde cualquier clase en cualquier paquete. Esto significa que no hay restricciones de acceso y cualquier clase puede acceder y utilizar los miembros públicos.

Private: El modificador private es el nivel de acceso más restrictivo. Los miembros privados solo son accesibles dentro de la misma clase en la que se definen. Esto significa que no se pueden acceder directamente a los miembros privados desde otras clases, incluso si son subclases. Los miembros privados se utilizan para encapsular detalles internos de una clase y ocultarlos a otras partes del programa.

Protected: El modificador protected permite el acceso a los miembros desde la misma clase, las subclases y otras clases en el mismo paquete. Sin embargo, los miembros protegidos no son accesibles desde clases que están en diferentes paquetes, a menos que la clase en otro paquete sea una subclase de la clase que define el miembro protegido. Los miembros protegidos se utilizan para permitir el acceso controlado a las subclases y a otras clases relacionadas en el mismo paquete.

Default: El modificador de acceso "default" (también conocido como "sin modificador de acceso") no se especifica explícitamente mediante una palabra clave. Si no se especifica ningún modificador de acceso, se asume que el miembro tiene acceso de nivel "default". Los miembros con acceso "default" son accesibles desde la misma clase y también desde otras clases en el mismo paquete. Sin embargo, no son accesibles desde clases en paquetes diferentes, incluso si son subclases.