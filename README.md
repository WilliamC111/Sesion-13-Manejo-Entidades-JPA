# Sesion-13-Manejo-Entidades-JPA

# LibraryApp

LibraryApp es un sistema de gestión bibliotecaria desarrollado con Spring Boot, Thymeleaf y MySQL.

## 📋 Requisitos

Para ejecutar el proyecto necesitas:

- Java 17 o superior
- MySQL con una base de datos activa
- El archivo `schema.sql` ubicado en `src/main/resources` contiene las operaciones necesarias para crear el esquema y las tablas

## ⚙️ Configuración de la base de datos

1. Crea una base de datos en MySQL para almacenar los datos bibliotecarios
2. Modifica el archivo `application.properties` en `src/main/resources` con tus credenciales:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tu_basedatos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
⚙️ Configuración del puerto
En el mismo archivo application.properties configura el puerto:

properties
Copy
server.port=8080
✔️ Ejecución del proyecto
Clona o descarga el proyecto

Ábrelo en tu IDE preferido

Ejecuta el archivo principal LibraryappApplication.java ubicado en src/main/java/edu/uptc/swii/libraryapp

La aplicación estará disponible en http://localhost:PUERTO

🚀 Características principales
Gestión de libros y editoriales

Búsqueda avanzada de libros

Relación muchos-a-uno entre libros y editoriales

Interfaz amigable con Bootstrap

🛠️ Tecnologías utilizadas
Spring Boot 3.3.5

Thymeleaf

Spring Data JPA

MySQL

Bootstrap 4

🤝 Contribuidores
Proyecto creado por:

Juan David Ochoa
GitHub | LinkedIn

William Cely
GitHub | LinkedIn

Andrés Maldonado
GitHub | LinkedIn
