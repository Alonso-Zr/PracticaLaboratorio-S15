public class RelojBarista implements Observer {
    @Override
    public void mostrarEnPantalla(String estado) {
        System.out.println("Estado en el reloj inteligente de barista es: " + estado);
    }
}
