import java.time.LocalDate;

public class ZeroDiscount extends Rabattstrategie{
    public ZeroDiscount(double regulärpreis, LocalDate flugdatum, String flugnummer, String bezeichnung) {
        super(regulärpreis, flugdatum, flugnummer, bezeichnung);
    }
}
