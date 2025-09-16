package modelo;

import java.util.ArrayList;
import java.util.List;

public class NotificacionService implements Subject {
    private List<Observer> observadores = new ArrayList<>();

    @Override
    public void suscribir(Observer o) {
        observadores.add(o);
    }

    @Override
    public void cancelar(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificar(String mensaje) {
        for (Observer o : observadores) {
            o.update(mensaje);
        }
    }
}
