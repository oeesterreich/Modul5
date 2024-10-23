import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Objects;

public class Rabatt extends Rabattstrategie{

    private double maxidisount = 0.7;
    private double mididiscount = 0.85;

    public Rabatt(double regulärpreis, LocalDate flugdatum, String flugnummer) {
        super(regulärpreis, flugdatum, flugnummer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rabatt rabatt = (Rabatt) o;
        return Double.compare(maxidisount, rabatt.maxidisount) == 0 && Double.compare(mididiscount, rabatt.mididiscount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxidisount, mididiscount);
    }



    public double getReduzierterPreis(double regulärpreis)
    {
        if (getFlugdatum().getMonth() == Month.JANUARY||getFlugdatum().getMonth() == Month.APRIL||getFlugdatum().getMonth() == Month.OCTOBER)
        {
            regulärpreis = regulärpreis * maxidisount;
            setBezeichnung("Maxi discount mit 30%");
            return regulärpreis;
        } else if (getFlugdatum().getMonth() == Month.FEBRUARY||getFlugdatum().getMonth() == Month.MARCH) {
            regulärpreis = regulärpreis * mididiscount;
            setBezeichnung("Mididiscount mit 15%");
            return regulärpreis;
        } else {
            setBezeichnung("Sie bekommen in diesen Monaten keinen Discount!");
            return regulärpreis;
        }
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
            System.out.println("Rabattierterpreis: " + getReduzierterPreis(getRegulärpreis()));
            System.out.println("*******************************************************************\n");
    }


}
