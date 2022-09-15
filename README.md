# Distinct Subsequence

El desarrollo de la aplicación para obtener la subsecuencia de una cadena de caracteres fue construido con al siguiente tecnología: 

  * Spring boot.
  * Java 11.

El servicio será desplegado como una función lambda que es un servicio serverlees lo que significa que permite ejecutar código sin tener que invertir en servidores o administrarlos. Una de las ventajas es que ejecuta el código sólo cuando es necesario y permite escalar automáticamente.

La invocación de la función lambda se va a realizar por medio de api gateway, este servicio permite una comunicación eficiente entre clientes externos y el api backend, adicionalmente aplica políticas, autenticación y control de acceso.

## Diagrama capas de la aplicación 

![image](https://user-images.githubusercontent.com/17581875/190307431-644fa2ec-1cc5-4d3d-92fa-9c1274d6a327.png)

