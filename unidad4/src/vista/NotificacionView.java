package vista;

public class NotificacionView {
    public void mostrarMenu() {
        System.out.println("1. Suscribir usuario");
        System.out.println("2. Cancelar suscripción");
        System.out.println("3. Enviar notificación");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
