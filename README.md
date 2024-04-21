# JavaB&B

<img src="https://github.com/ImLecus/JavaPL2/blob/main/javabnb/src/main/resources/images/logo.png" width=200>

JavaB&B es un proyecto de la asignatura de Programación realizado por Marcos González Fernández y Guillermo Ramos Santos. Este repositorio contiene todo el código fuente del programa en un proyecto Maven de Java, así como la documentación necesaria para mostrar el proceso de desarrollo que hemos seguido.

### Documentación

Dentro de la carpeta `docs/` del repositorio se pueden encontrar varios archivos referentes al desarrollo del proyecto:
* Varios archivos con diagramas de clases, flujo y casos de uso.
* Un diario de desarrollo
* Una memoria del proyecto
* Archivos de ejemplo o guidelines para el diseño de la aplicación.

### Ejecutar la aplicación

El archivo .java a ejecutar se encuentra en la carpeta `javabnb/src/main/java/gui/`, siendo dicho archivo [App.java](https://github.com/ImLecus/JavaPL2/blob/main/javabnb/src/main/java/gui/App.java). Funciona como un punto de entrada, por tanto tratar de ejecutar la aplicación con otro archivo resultará en una ejecución errónea o inexistente.

La aplicación está pensada para correr en una pantalla HD de 1920x1080, por lo que recomendamos dicha resolución para que la experiencia sea óptima.

### Polaris

En el transcurso del desarrollo, las capacidades gráficas de Swing fueron limitando más y más la creación de nuevos componentes. En la carpeta `javabnb/src/main/java/polaris/` se encuentra una pequeña librería que extiende Swing con nuevos componentes que utilizaremos en la aplicación. La librería está planteada de tal forma que sea independiente al proyecto y se pueda usar en cualquier proyecto de Swing.
