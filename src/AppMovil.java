public class AppMovil implements Observer {
    @Override
    public void mostrarEnPantalla(String estado) {
        System.out.println("Estado en la notificación de la App Movil: " + estado);
    }
}
