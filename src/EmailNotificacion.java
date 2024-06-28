public class EmailNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}