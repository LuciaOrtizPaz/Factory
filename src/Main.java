public class Main {
    public static void main(String[] args) {
        NotificacionFactory factoryMethod = new NotificacionFactory();
        Notificacion notificacionEmail = factoryMethod.crearNotificacion("EMAIL");
        notificacionEmail.enviarMensaje("Este es un mensaje de prueba para el email.");

        Notificacion notificacionSMS = factoryMethod.crearNotificacion("SMS");
        notificacionSMS.enviarMensaje("Este es un mensaje de prueba para el SMS.");

        Notificacion notificacionApp = factoryMethod.crearNotificacion("APP");
        notificacionApp.enviarMensaje("Este es un mensaje de prueba para la aplicación.");

        NotificacionAbstractFactory urgenteFactory = new UrgenteNotificacionFactory();
        Notificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        urgenteEmail.enviarMensaje("Este es un mensaje urgente de prueba para el email.");

        NotificacionAbstractFactory regularFactory = new RegularNotificacionFactory();
        Notificacion regularSMS = regularFactory.crearSMSNotificacion();
        regularSMS.enviarMensaje("Este es un mensaje regular de prueba para el SMS.");
    }
}
