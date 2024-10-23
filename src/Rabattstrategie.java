import java.time.LocalDate;

public class Rabattstrategie extends Angebot {
    private String bezeichnung;

    public Rabattstrategie(double regulärpreis, LocalDate flugdatum, String flugnummer) {
        super(regulärpreis, flugdatum, flugnummer);
    }

    public double getReduzierterPreis(double regulärpreis)
    {
        return regulärpreis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Bezeichnung: " + this.bezeichnung);
    }
}
