package app;

import controlador.NotificacionController;
import modelo.*;
import vista.NotificacionView;

public class Main {
    public static void main(String[] args) {
        NotificacionService servicio = new NotificacionService();
        NotificacionView vista = new NotificacionView();
        NotificacionController controller = new NotificacionController(servicio, vista);

        Usuario u1 = new Usuario("Carlos");
        Usuario u2 = new Usuario("Ana");
        Usuario u3 = new Usuario("María");

        controller.suscribirUsuario(u1);
        controller.suscribirUsuario(u2);
        controller.suscribirUsuario(u3);

        controller.enviarNotificacion("Nuevo mensaje en la bandeja de entrada.");

        controller.cancelarUsuario(u2);

        controller.enviarNotificacion("Se ha enviado un nuevo pedido.");
    }
}
