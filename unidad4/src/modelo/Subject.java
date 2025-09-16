package modelo;

public interface Subject {
    void suscribir(Observer o);
    void cancelar(Observer o);
    void notificar(String mensaje);
}
