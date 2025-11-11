INSERT INTO COURSE (id, title, instructor, duration_hours, difficulty, capacity, enrolled_count, description, modules, version, created_at)
VALUES
(1,
 'Java Básico',
 'María Pérez',
 20,
 'BEGINNER',
 30,
 5,
 'Curso introductorio de Java para principiantes. Aprendé la lógica de programación y los fundamentos del lenguaje.',
 'Módulo 1: Introducción a la programación y al entorno Java
Módulo 2: Variables, tipos de datos y estructuras de control
Módulo 3: Programación orientada a objetos (POO)
Módulo 4: Manejo de excepciones y colecciones básicas
Módulo 5: Proyecto final: mini aplicación de consola',
 0,
 CURRENT_TIMESTAMP()
),

(2,
 'Spring Boot APIs REST',
 'Carlos Gómez',
 30,
 'INTERMEDIATE',
 25,
 24,
 'Desarrollá APIs REST seguras y escalables utilizando Spring Boot y las mejores prácticas del ecosistema Java.',
 'Módulo 1: Fundamentos de Spring Framework
Módulo 2: Arquitectura y estructura de un proyecto Spring Boot
Módulo 3: Creación de controladores y endpoints REST
Módulo 4: Validación, manejo de errores y seguridad con Spring Security
Módulo 5: Persistencia con JPA y base de datos H2/MySQL
Módulo 6: Documentación con Swagger y despliegue en la nube',
 0,
 CURRENT_TIMESTAMP()
),

(3,
 'Angular desde cero',
 'Lucía Fernández',
 25,
 'BEGINNER',
 40,
 10,
 'Aprendé a desarrollar aplicaciones frontend modernas con Angular, TypeScript y RxJS.',
 'Módulo 1: Introducción a TypeScript y al ecosistema Angular
Módulo 2: Componentes, módulos y data binding
Módulo 3: Directivas, pipes y formularios reactivos
Módulo 4: Consumo de APIs REST y servicios HTTP
Módulo 5: Enrutamiento, lazy loading y buenas prácticas
Módulo 6: Proyecto final: aplicación SPA completa',
 0,
 CURRENT_TIMESTAMP()
),

(4,
 'Arquitectura de Microservicios',
 'Roberto Díaz',
 40,
 'ADVANCED',
 10,
 10,
 'Diseñá sistemas distribuidos escalables utilizando arquitecturas basadas en microservicios.',
 'Módulo 1: Fundamentos y patrones de microservicios
Módulo 2: Comunicación entre servicios (REST, gRPC, mensajería)
Módulo 3: Service Discovery, API Gateway y configuración centralizada
Módulo 4: Resiliencia, tolerancia a fallos y observabilidad
Módulo 5: Contenerización con Docker y orquestación con Kubernetes
Módulo 6: Estrategias de despliegue y CI/CD',
 0,
 CURRENT_TIMESTAMP());
