import java.time.LocalDate;

public class Angebot {
    private double regulärpreis;
    private LocalDate flugdatum;
    private String flugnummer;

    public Angebot(double regulärpreis, LocalDate flugdatum, String flugnummer) {
        this.regulärpreis = regulärpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
    }

    protected void rabattsrategieWählen(){

    }

    public double getRegulärpreis() {
        return regulärpreis;
    }

    public void setRegulärpreis(double regulärpreis) {
        this.regulärpreis = regulärpreis;
    }

    public LocalDate getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(LocalDate flugdatum) {
        this.flugdatum = flugdatum;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        this.flugnummer = flugnummer;
    }

    public double getReduzierterPreis(){

    }

    @Override
    public String toString() {
        return "Angebot{" +
                "regulärpreis=" + regulärpreis +
                ", flugdatum=" + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                '}';
    }
}
