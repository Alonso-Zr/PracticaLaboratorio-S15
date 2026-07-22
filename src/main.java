public class main {
    public static void main(String[] args) {

        MonitorPedido monitor = new MonitorPedido();

        Observer pantalla = new PantallaLocal();
        Observer app = new AppMovil();
        Observer reloj = new RelojBarista();

        monitor.agregarObservadores(pantalla);
        monitor.agregarObservadores(app);
        monitor.agregarObservadores(reloj);

        System.out.println("Actualizando estado del pedido");
        monitor.setEstadoPedido("Recibido");

        System.out.println("\nActualizando estado del pedido");
        monitor.setEstadoPedido("En Preparación");

        System.out.println("\nActualizando estado del pedido");
        monitor.setEstadoPedido("Listo para Entregar");

    }
}