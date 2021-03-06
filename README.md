# IETI-spring-boot-rest-api 馃И

### Parte 1: Implementaci贸n de la API RESTFUL del microservicio de usuario

1. Cree un nuevo proyecto usando [Spring Initializr] (https://start.spring.io/)
     * Utilice * Java * o * Kotlin * como su lenguaje de programaci贸n.
     * Use Gradle como una opci贸n de proyecto (si su computadora es lenta, use Maven)
     * Agregue la dependencia de Spring Web antes de construir el proyecto.
2. Cree un nuevo repositorio en Github y confirme los archivos generados en 1.
3. Cree un nuevo paquete llamado * dto * y dentro defina su objeto * UserDto * con al menos los siguientes campos:
       * Nombre.
       * Correo electr贸nico.
       * apellido.
4. Cree un nuevo paquete llamado * datos * y dentro defina su objeto de datos * Usuario * con al menos los siguientes campos:
       * identificaci贸n.
       * Nombre.
       * Correo electr贸nico.
       * apellido.
       * Creado en.
5. Cree un nuevo paquete llamado * servicio *

* Se realiza petici贸n get de la lista de User

![Get](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/get.PNG)


* Se realiza petici贸n get donde se le env铆a el id del usuario a buscar

![GetById](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/getById.PNG)


* Se realiza petici贸n post para crear un nuevo usuario

![PostCreate](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/createUserPost.PNG)


* Se realiza petici贸n put para realizar update de un usuario

![Put](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/put.PNG)


Al momento de actualizar al nuevo usuario y realizar un get se puede observar que si actualiz贸 la lista que contiene un objeto de tipo usuario

![getPut](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/getDelPut.PNG)


* Se realiza petici贸n delete para eliminar un usuario con un id espec铆fico, retorna true si se elimin贸 satisfactoriamente 

![deleteTrue](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/deleteTrue.PNG)


Al momento de eliminar un usuario que no existe nos retornar谩 false

![deleteFalse](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/deleteFalse.PNG)



## JavaDoc 馃摉

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/PicasYFamasGame/tree/master/javadoc) .

## Licencia 馃搶

Este proyecto est谩 bajo la Licencia P煤blica General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/LICENSE.txt) para obtener m谩s detalles.

