# PruebaLeanT
Prueba de Automatizacion de LeanTech

La prueba consiste en la automatizacion de escenarios
de Login exitoso, Login fallido, compra del producto mas economico
y compra del producto mas costoso de la pagina: https://www.saucedemo.com/
Se tienen en cuentas los usuarios que estan en dicha pagina, en la parte inferior para los escenarios propuestos.

El proyecto esta desarrollado en Java, con el patron de diseño Screenplay, donde los escenarios estan escritos en lenguaje Gherkin.

El proyecto contiene las siguientes carpetas:

-Utils: El paquete donde se encuentra la clase que maneja el driver usado en la automatizacion.

-Questions:El paquete donde se crea la clase donde se manejan las comparaciones y validaciones.

-Tasks: paquete donde se crean las clases con las acciones que realiza el actor.

-Userinterface: paquete donde se crea la clase donde se mapean los objetos.

-Runners: paquete donde se crea la clase que ejecuta la automatizacion.


Para la ejecucion del proyecto se debe tener instalado:
- Intellij, Java 1.8, gradle.
  
- Tener configuradas las variables de entorno.

- Importar el projecto en Intellij y ejecutar la clase Runner.


En la carpeta Target del proyecto, podra observar las evidencias de la ejecucion de los escenarios.