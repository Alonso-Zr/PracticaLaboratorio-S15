import java.util.ArrayList;
import java.util.List;

public class MonitorPedido {
    private String estadoPedido;
    private List<Observer> observadores;

    public MonitorPedido() {
        this.observadores = new ArrayList<>();
    }

    public void agregarObservadores(Observer o) {
        observadores.add(o);
    }

    public void eliminarObservador(Observer o) {
        observadores.remove(o);
    }

    public void setEstadoPedido(String estado) {
        this.estadoPedido = estado;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observer o : observadores) {
            o.mostrarEnPantalla(this.estadoPedido);
        }
    }
}
