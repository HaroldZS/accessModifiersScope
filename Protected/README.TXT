Acceso protegido a través de la herencia

Existe una excepción a la regla de acceso protegido que se conoce como "acceso protegido a través de la herencia". Esta excepción permite que las subclases accedan a los miembros protegidos de una clase base, incluso si las subclases no están en el mismo paquete que la clase base.

En este caso, al intentar acceder al atributo userName o llamar al método protectedUserMethod() directamente desde la instancia de SubClassUser, fuera de la jerarquía de herencia, no funcionará.

Esto se debe a que el acceso protegido solo se aplica dentro de la jerarquía de herencia y a través de las subclases. En este caso, SubClassUser puede acceder y modificar los atributos protegidos y llamar a los métodos protegidos de la clase User porque es una subclase de User. Sin embargo, desde una clase externa como ProtectedAccessByHeredity, no podrás acceder directamente a los atributos o métodos protegidos de User o SubClassUser.

Recuerda que el acceso protegido permite el acceso dentro del mismo paquete y a través de la herencia, pero no fuera del paquete en clases que no sean subclases.