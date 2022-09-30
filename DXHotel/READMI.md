# Automatizacion_DXHOTEL

Se realizar la automatización de la platafoma DXHOTEL la cual trata de ventas en la agencia de viajes, por medio de url https://js.devexpress.com/Demos/DXHotels/#home se desea validar y verificar el correcto funcionamiento de las funcionalidades.

     1.buscar hoteles en las diferentes ciudades 
     2.escoger el hotel mas economico de manera dinamica y calcular que el precio total sea el correspondiente



Comenzando ️

Con este proyecto se desea realizar una automatización WEB basandonos en los principios SOLID y FIRST, para un mejor entendimiento en los resportes se utiliza BDD, Cucumber y serenity con el gestor de dependencias Maven.

Pre-requisitos 

Para la ejecución de este proyecto desdemos tener presente que debemos tener instalado el JDK de java y las variables de entorno, las cuales son:

    JAVA_HOME: Descarga el JDK de Java y adjuntamos la ruta en donde se encuentra la carpeta, en mi caso la tengo en C:\Program Files (x86)\Java\jdk1.8.0_251

    MAVEN_HOME: Descarga el Apache Maven y se adjunta la ruta en donde se encuentre la carpeta, en mi caso la tengo en C:\Program Files\apache-maven-3.6.3-bin\apache-maven-3.6.3

Tener un IDE instalado para la observación o modificación del codigo.

En la raiz de proyecto debemos tener 2 archivos, los cuales son:
- serenity.properties
- chromedriver.exe : Este archivo debe ser compatible con la versiòn que se tenga en la maquina

Ejecutando las pruebas ️

Para la ejecución del proyecto debe tener presente que las variables de entornos se encuentre bien configuradas, adicional debe tener las dependencias descargadas la cual se encuentra en el archivo pom.xml.

La prueba se puede ejecutar por medio del package runners, la cual esta ubicada en src/test/java/com/steedup/qa/runners o por medio de la consola del proyecto con el comando

       mvn clean verify

Reporte  
para generar el reporte se debe ejecutar en la consola el comando:
 
               mvn clean verify serenity:aggregate
luego vas a la siguiente ruta target/site/index.html y este archivo abrirlo en el browser.



