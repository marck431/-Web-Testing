
# Automatización Pragma - DemoQA

_En este desarrollo usted podra encontrar un robot con un set de distintas pruebas automatizadas para la pagina DemoQA, utilizando herramientas como lo son Serenity BDD, Gradle, Cucumber, Gherkin, Java, entre otras. es importante aclarar que puede que el robot puede fallar ya que se observo que las apis cambian la forma en como se consumen y responde, por ende, es posible que algunas pruebas fallen._

### Pre-requisitos 📋

_Necesitas tener previamente instalado en tu maquina:_

* [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) - El IDe De preferencia
* [Chrome Driver](https://chromedriver.chromium.org/downloads) - Chrome driver para manipular el navegador Google Chrome, descarga la version que tengas en tu PC.
* [Gecko Driver](https://github.com/mozilla/geckodriver/releases) - Gecko Driver para manipular el navegador Mozilla Firefox, descarga la version que tengas en tu PC.
* [Java 8](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html) - El JDK para correr el robot - (Opcionales)
* [Gradle](https://gradle.org/install/) - El Gestor de dependencias (Opcionales)


### Instalación 🔧

_Una ves tengas instalados los programas anteriormente mencionados, hay que realizar una configuracion muy basica si NO bajaste los opcionales; En caso de que quieras instalar los opcionales en tu maquina, es recomendable que los instales con la aplicacion_ [Chocolatey](https://chocolatey.org/install) _ya que esta se encarga de realizar la configuracion de las variables de entorno para dichas herramientas._

_**Chrome Driver** al descargar, descomprima el archivo y coloquelo en la raiz del desarrollo._

_Cuando tengas instalado **IntelliJ** tendremos que instalar unos plugins para que pueda leer y ejecutar las pruebas; Vamos al apartado de plugins de IntelliJ y buscamos e instalamos desde el marketplace de intelliJ los siguientes plugins:_

* Gradle (Normalmente viene instalado por defecto, pero algunas veces no es asi, por ende hay que revisar.)
* Gherkin 
* Cucumber For Java

_Una ves instalados, Reinicialos el Intellij y ya tendriamos listo el ambiente._

**Para las opcionales**
_Para facilitar el proceso vamos a intalar [Chocolatey](https://chocolatey.org/install) y reiniciamos el PC, a continuacion abriremos un CMD o Power Shell como administrador y ejecutaremos los siguientes comandos, dando Yes a lo que nos pregunte la consola_

**Instalamos Gradle**
```
choco install gradle
```

**Instalamos JDK 8**
```
choco install jdk8
```

_De esta forma ya tendriamos configuradas las herramientas basicas para la ejecucion de las pruebas_

## Ejecutando las pruebas ⚙️

* Si deseas ejecutar una prueba en especial _Selecciona el runner que quieres ejecutar y preciona el boton que aparece al lado de los numeros de las lineas._
* Si deseas ejecutar una prueba ya sea en Chrome o Firefox. _Dirigete al archivo **serenity.properties** y des comenta las siguientes líneas de codigo:_
```
webdriver.driver={driver del navegador}
```
```
webdriver.{nombre del driver}.driver = {Ruta del driver}
```
```
{nombre del driver}.switches = --disk-cache-dir=null;--disable-popup-blocking,--incognito;--disable-download-notification,--start-maximized,--test-type,--ignore-certificate-errors, --allow-running-insecure-content, --disable-translate, --always-authorize-plugins, --disable-extensions
```
## Reporte 🚀
* Si deseas generar el reporte del resultado de las pruebas _ejecuta el siguiente comando, este te mostrará en una interfaz grafica los escenarios que pasaron o en su defecto que fallaron._

```
Gradle report
```

## Construido con 🛠️

* [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) - El IDe De preferencia
* [Chrome Driver](https://chromedriver.chromium.org/downloads) - Chrome driver para manipular el navegador
* [Java 8](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html) - El JDK para correr el robot.
* [Gradle](https://gradle.org/install/) - El Gestor de dependencias
* [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html) - El framework utilizado
* [Cucumber](https://cucumber.io/) - Herramienta que se encarga de transformar los scenarios a lenguaje maquina
* [Gherkin](https://cucumber.io/docs/gherkin/) - El lenguaje que en el que estan escritas las pruebas 


## Autor ✒️
* **Marcos Silva** - SQA
