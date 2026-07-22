public class PantallaLocal implements Observer {
    @Override
    public void mostrarEnPantalla(String estado) {
        System.out.println("Estado en la pantalla del local es: " + estado);
    }
}
