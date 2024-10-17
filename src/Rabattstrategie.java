import java.time.LocalDate;

public class Rabattstrategie extends Angebot {
    private String bezeichnung;

    public Rabattstrategie(double regulärpreis, LocalDate flugdatum, String flugnummer, String bezeichnung) {
        super(regulärpreis, flugdatum, flugnummer);
        this.bezeichnung = bezeichnung;
    }

    public double getReduzierterPreis(double preis)
    {
        return preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
