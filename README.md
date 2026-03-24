1. Levantar la API
   <img width="921" height="460" alt="image" src="https://github.com/user-attachments/assets/002db76f-e3d1-4059-b88c-315ce89dde01" />
2. Pruebas en Postman
Prueba 1: Obtener cursos
 <img width="921" height="337" alt="image" src="https://github.com/user-attachments/assets/9d71641b-22d6-4dd6-ac2e-1d16ce0536f8" />
Prueba 2: Crear curso válido
<img width="931" height="403" alt="image" src="https://github.com/user-attachments/assets/e903f21b-7ccc-4d12-9033-b8ca5d64127f" />
Prueba 3: Error por nombre vacío
<img width="921" height="392" alt="image" src="https://github.com/user-attachments/assets/eb0775c4-89c1-4713-a861-f4818b738c0f" />
Prueba 4: Error por horas nulas
<img width="921" height="385" alt="image" src="https://github.com/user-attachments/assets/1bf32170-fa90-4f61-9dec-94bbd8f4b0b0" />

 
¿Qué hace @RequestBody?
es la solicitud que se encargaria de enviar datos al servidor en el formato json
¿Para qué sirve @Valid?
se encarga de activar las validaciones de las entidades
Diferencia entre @NotNull y @NotBlank 
en que not null se encargara de verificar solamente que los atributos no queden vacios, mientras que notBlank se encargaba de verificar que no sean solo espacios vacios o comillas
¿Por qué usamos List en vez de arreglos?
poque nos permiten modificar, añadir, eliminar elementos sin la necesidad de conocer el tamaño mientras que en los arreglos se necesita de un tamaño ya determinado
