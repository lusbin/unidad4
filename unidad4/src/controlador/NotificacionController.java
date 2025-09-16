package controlador;

import modelo.*;
import vista.NotificacionView;

public class NotificacionController {
    private NotificacionService servicio;
    private NotificacionView vista;

    public NotificacionController(NotificacionService servicio, NotificacionView vista) {
        this.servicio = servicio;
        this.vista = vista;
    }

    public void suscribirUsuario(Usuario usuario) {
        servicio.suscribir(usuario);
        vista.mostrarMensaje("Usuario " + usuario + " suscrito correctamente.");
    }

    public void cancelarUsuario(Usuario usuario) {
        servicio.cancelar(usuario);
        vista.mostrarMensaje("Usuario eliminado de la lista de notificaciones.");
    }

    public void enviarNotificacion(String mensaje) {
        servicio.notificar(mensaje);
        vista.mostrarMensaje("Notificación enviada a todos los usuarios.");
    }
}