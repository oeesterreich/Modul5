import java.time.LocalDate;

public class MaxiDisount extends Rabattstrategie{
    public MaxiDisount(double regulärpreis, LocalDate flugdatum, String flugnummer, String bezeichnung) {
        super(regulärpreis, flugdatum, flugnummer, bezeichnung);
    }

    public double getReduzierterPreis(double preis)
    {
        return preis;
    }
}
