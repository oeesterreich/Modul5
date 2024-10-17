import java.time.LocalDate;

public class Angebot {
    private double regulärpreis;
    private LocalDate flugdatum;
    private String flugnummer;

    public Angebot(double regulärpreis, LocalDate flugdatum, String flugnummer) {
        this.regulärpreis = regulärpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
        getReduzierterPreis(regulärpreis);
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

    public double getReduzierterPreis(double regulärpreis){
        return regulärpreis;
    }

    public void anzeigen(){
        System.out.println("*** Flugticket ***");
        System.out.println("Flugdatum: " + this.flugdatum);
        System.out.println("Flugnummer: " + this.flugnummer);
        System.out.println("Regulärpreis: " + this.regulärpreis);
    }
}
