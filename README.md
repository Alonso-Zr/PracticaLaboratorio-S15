# Sistema de Monitoreo de Pedidos - Tienda de Café 

Implementación del patrón de diseño Observer para notificar el estado de los pedidos en una tienda de café

## Descripción del Problema

En un negocio como una tienda de café, es fundamental mantener informados a diferentes actores sobre el progreso de un pedido (Estados -> "Recibido", "En Preparación", "Listo para Entregar")

La tienda cuenta con múltiples dispositivos que necesitan recibir y mostrar esta información en tiempo real:
*   **Pantalla Local:** Ubicada en el local para que los clientes vean el estado de su pedido
*   **App Móvil:** Usada por los clientes para rastrear su pedido desde el teléfono
*   **Reloj del Barista:** Un smartwatch usado por el personal 

**El reto de diseño:**
El sistema necesita notificar a todos estos dispositivos cada vez que cambia el estado de un pedido. Sin embargo, acoplar directamente la clase que gestiona el pedido (`MonitorPedido`) a las clases específicas de cada dispositivo generaría un código rígido y difícil de mantener. Si en el futuro la tienda decide agregar un nuevo dispositivo, se tendría que modificar el código central del monitor.

Entonces se requiere una solución que permita acoplar y desacoplar dispositivos dinámicamente sin alterar el código del gestor principal de pedidos.

## Solución: Patrón Observer

Para resolver este problema, aplicamos el patrón **Observer**.
Por ende, se extrajo el comportamiento de notificación a una interfaz común (`Observer`).

## Diagrama UML de Clases
<img width="1280" height="874" alt="DiagramaUML-S15" src="https://github.com/user-attachments/assets/a3f613ec-b797-4673-ac67-83e1000bf64b" />


