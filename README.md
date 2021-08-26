# IETI-spring-boot-rest-api

### Parte 1: Implementación de la API RESTFUL del microservicio de usuario

1. Cree un nuevo proyecto usando [Spring Initializr] (https://start.spring.io/)
     * Utilice * Java * o * Kotlin * como su lenguaje de programación.
     * Use Gradle como una opción de proyecto (si su computadora es lenta, use Maven)
     * Agregue la dependencia de Spring Web antes de construir el proyecto.
2. Cree un nuevo repositorio en Github y confirme los archivos generados en 1.
3. Cree un nuevo paquete llamado * dto * y dentro defina su objeto * UserDto * con al menos los siguientes campos:
       * Nombre.
       * Correo electrónico.
       * apellido.
4. Cree un nuevo paquete llamado * datos * y dentro defina su objeto de datos * Usuario * con al menos los siguientes campos:
       * identificación.
       * Nombre.
       * Correo electrónico.
       * apellido.
       * Creado en.
5. Cree un nuevo paquete llamado * servicio *

* Se realiza petición get de la lista de User

![Get](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/get.PNG)


* Se realiza petición get donde se le envía el id del usuario a buscar

![GetById](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/getById.PNG)


* Se realiza petición post para crear un nuevo usuario

![PostCreate](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/createUserPost.PNG)


* Se realiza petición put para realizar update de un usuario

![Put](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/put.PNG)


Al momento de actualizar al nuevo usuario y realizar un get se puede observar que si actualizó la lista que contiene un objeto de tipo usuario

![getPut](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/getDelPut.PNG)


* Se realiza petición delete para eliminar un usuario con un id específico, retorna true si se eliminó satisfactoriamente 

![deleteTrue](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/deleteTrue.PNG)


Al momento de eliminar un usuario que no existe nos retornará false

![deleteFalse](https://github.com/Jose1102/IETI-spring-boot-rest-api/blob/main/images/deleteFalse.PNG)
