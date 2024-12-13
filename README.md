# Estrategia Single Table

En esta captura se ve la anotación necesaria para la superclase

![singleParentClass](https://github.com/user-attachments/assets/22b67e1b-0646-4737-bb6a-ab67cc6028a4)

En esta captura se ve la anotación necesaria para la subclase

![singleChildClass](https://github.com/user-attachments/assets/4b4e72f3-5f7b-4ee9-9f4a-34a83f7361f1)

En esta captura podemos ver las tablas generadas (se incluye la generada por el atributo multievaluado) 

![singleTables](https://github.com/user-attachments/assets/d010c72f-f840-43d4-b47a-dbaaa3c9745e)



# Estrategia Table Per Class

En esta captura se ve la anotación necesaria para la superclase

![tableperclassParentClass](https://github.com/user-attachments/assets/f8f7e594-fde9-43da-9325-6710e3264e8f)

En esta captura se ve la anotación necesaria para la subclase

![tableperclassChildClass](https://github.com/user-attachments/assets/e366be0c-8f89-4bfc-a772-cbc0073c6477)

En esta captura podemos ver las tablas generadas

![tableperclassTables](https://github.com/user-attachments/assets/15db7de2-5f9d-42ac-9cd9-8451693cccd7)


# Estrategia Joined

En esta captura se ve la anotación necesaria para la superclase

![joinedParentClass](https://github.com/user-attachments/assets/5a36c4c0-d5b5-45ee-93fc-f95e6efb9a4a)

En esta captura se ve la anotación necesaria para la subclase

![joinedChildClass](https://github.com/user-attachments/assets/a0624ab8-6d64-4da8-a02e-832938dc2065)

En esta captura podemos ver las tablas generadas

![joinedTables](https://github.com/user-attachments/assets/dac1c201-9a0c-4c4e-8dc9-9aa9b19ef74d)



# ¿Cuál crees que es la mejor solución para este tipo de supuesto? 

Creemos que la mejor opción es la estrategia Joined, ya que es la que más se asemeja al formato normalizado de bases de datos. 
Las consultas no son demasiado complejas, ya que las claves foraneas nos permiten usar los JOIN para conseguir los datos que queremos. Además esta estrategia ofrece un formato extensible.

# Dirección como Objeto Incrustrado

Anotacion en la clase Direccion

![embeddable](https://github.com/user-attachments/assets/fc5368be-fcf8-46f9-a795-88e2c72a8b16)

Anotación en la clase Persona

![Embeded](https://github.com/user-attachments/assets/9f598669-7e0b-4f30-97f8-f3f1e008145d)



