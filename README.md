## 🧠 Proyecto: CRUD de Cursos con Spring Boot y Thymeleaf

### 📋 Descripción

Este proyecto implementa un CRUD básico (Crear, Leer, Actualizar y Eliminar) para la entidad Curso, utilizando Spring Boot, Thymeleaf, Spring Data JPA y MySQL.
Incluye vistas con Bootstrap, manejo de fragmentos (navbar reutilizable), y datos de prueba para inicializar la base de datos.

⸻

### ⚙️ Tecnologías utilizadas <br>
•	Java 17 <br>
•	Spring Boot 3.x <br>
•	Thymeleaf <br>
•	Spring Data JPA (Hibernate) <br>
•	MySQL <br>
•	Bootstrap 5

⸻


### 🛠️ Configuración previa
1.	#### Crear una base de datos en MySQL llamada:

```sql 
CREATE DATABASE tecsup;
```

2.	#### Editar el archivo src/main/resources/application.properties con tus credenciales:

spring.datasource.url=jdbc:mysql://localhost:3306/crud_spring_boot
spring.datasource.username=root
spring.datasource.password=TU_PASSWORD
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true

⚠️ Se usa create-drop para que el esquema y las tablas se generen automáticamente cuando el profe ejecute el proyecto.

3.	#### (Opcional) Ejecutar el script base-de-datos.sql para insertar los datos de prueba.

⸻

### 🚀 Ejecución del proyecto
1.	Abrir el proyecto en IntelliJ IDEA o Spring Tool Suite.
2.	Ejecutar la clase principal (que contiene el método main).
3.	Abrir el navegador en http://localhost:8086/listar
(o el puerto que hayas configurado).

⸻

### 💡 Funcionalidades principales

✅ Listar cursos <br>
✅ Crear nuevos cursos <br>
✅ Editar cursos existentes <br>
✅ Eliminar cursos <br>
✅ Navbar reutilizable mediante fragmento Thymeleaf

⸻

