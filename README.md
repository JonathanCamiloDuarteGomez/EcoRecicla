# EcoRecicla

## Resumen de proyecto del diplomado de desarrollo de aplicaciones moviles intermedio .
# Aclaración
Este repositorio contiene únicamente el código desarrollado para el diseño de la interfaz del historial y el detalle de la factura de cada incidencia en el historial de reciclaje del usuario con rol de usuario general. El [repositorio del proyecto principal](https://github.com/gusefi1992/Reciclaje.git)  está en proceso y aún no se ha integrado el trabajo con los compañeros.

# Contexto

Nuestra propuesta busca implementar un centro de reciclaje innovador en la ciudad de Bogotá, donde operamos una flota de vehículos estratégicamente ubicados. Mediante una aplicación móvil, los usuarios pueden notificar cuando han acumulado una cantidad significativa de materiales reciclables. El vehículo más cercano recibe la alerta, etiqueta la recogida y se dirige al lugar indicado para recolectar los materiales. Una vez que los reciclables llegan a nuestra planta, se pesan y clasifican, registrando automáticamente los kilos en la cuenta del usuario. Además, se asignan "coins" a cada usuario
como recompensa por su contribución al reciclaje. Este sistema no solo optimiza la logística de recolección, sino que también incentiva y facilita a los usuarios el seguimiento y mejora continua de sus hábitos de reciclaje, fomentando un comportamiento más sostenible en Bogotá.

Esta propuesta está pensada para las personas que no se dedican al reciclaje, que viven en viviendas y apartamentos, y que cuentan con dos canecas de desperdicios: una para reciclables y otra para otro tipo de basura. De esta manera, buscamos involucrar a más ciudadanos en la práctica del reciclaje, haciéndolo accesible y conveniente para todos.

**_Nota_ :** _Este problema es totalmente ipotetico porque no tenemos ningun cliente o empresa que este interesada en el proyecto._


# Levantamiento de requerimientos.
El proyecto comenzó con el planteamiento del problema para entender la situación y las posibles necesidades. Después, se procedió a descartar y aprobar los casos de uso potenciales. Se desarrolló una flor de loto para identificar los módulos y las posibles pantallas según los requisitos. Durante este proceso, surgió la complejidad del proyecto al definirse tres tipos de usuarios: usuario general, conductor de vehículo y empresa. Por cuestiones de tiempo, se decidió enfocarse únicamente en el desarrollo para el usuario general.

Posteriormente, se llevó a cabo una planificación de sprint y se creó el backlog  con la ayuda de Jira. El objetivo de esta primera entrega es diseñar, implementar y facilitar la navegación entre las diversas funcionalidades.

| **Flor de loto** | **Cronograma Sprint 1** |
|:----------------:|:-----------------------:|
| <img src="/assets/florLoto.png" width="400"> | <img src="/assets/jira.png" width="400"> |

## Ejecución.

| **Pantalla Historial** | **Detalle de factura** |
|:----------------------:|:-----------------------:|
| <img src="/assets/historial.jpeg" width="400" height="600"> | <img src="/assets/detalle.jpeg" width="400" height="600"> |


**Explicación:**
Para el Historial, se diseñó una vista tipo acordeón que muestra todos los registros de ventas de material reciclable con una breve descripción. Al hacer clic en el botón de detalle, se accede a la vista de detalle de factura, donde se muestra dinámicamente la factura correspondiente a esa transacción con todos sus datos. 










