import java.time.LocalDate;

public class MidiDiscount extends Rabattstrategie{
    public MidiDiscount(double regulärpreis, LocalDate flugdatum, String flugnummer, String bezeichnung) {
        super(regulärpreis, flugdatum, flugnummer, bezeichnung);
    }
}
