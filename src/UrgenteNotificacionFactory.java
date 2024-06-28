public class UrgenteNotificacionFactory implements NotificacionAbstractFactory {
    @Override
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacion(); // Podría ser una subclase específica
    }

    @Override
    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacion(); // Podría ser una subclase específica
    }

    @Override
    public Notificacion crearAppNotificacion() {
        return new AppNotificacion(); // Podría ser una subclase específica
    }
}