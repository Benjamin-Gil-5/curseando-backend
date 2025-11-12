# curseando-backend

# Curseando Backend

API REST desarrollada en Java Spring Boot 3.x para la plataforma de gestión e inscripción de cursos online Curseando.
Permite listar cursos, obtener detalles y registrar inscripciones desde el frontend en Angular.

# Tecnologías utilizadas

Java 21

Spring Boot 3.x

Spring Web

Spring Data JPA

H2 Database (en memoria)

Maven (gestión de dependencias)

Lombok 

CORS habilitado para conexiones desde el frontend

##Instalación y ejecución

#Requisitos previos

Java 21 o superior

Maven 3.x

Frontend en ejecución (opcional para pruebas)

# Instalación y ejecución local

1. Clonar el repositorio:

git clone https://github.com/Benjamin-Gil-5/curseando-backend.git
cd curseando-backend


2. Compilar y ejecutar la aplicación:

./mvnw clean install
./mvnw spring-boot:run


3. La API se ejecutará por defecto en: http://localhost:8080

4. Acceder a la consola H2 (opcional):

http://localhost:8080/h2-console


JDBC URL: jdbc:h2:mem:curseando

Usuario: sa

Contraseña: (vacío)

# Endpoints principales

GET /api/courses → Listar todos los cursos

GET /api/courses/{id} → Detalle de un curso

POST /api/enrollments → Inscribir estudiante en un curso

Nota: Se valida que los cupos estén disponibles antes de inscribir al usuario.

# Base de datos

Se utiliza H2 en memoria para desarrollo rápido.

Para producción se puede cambiar a PostgreSQL o MySQL, modificando application.properties
