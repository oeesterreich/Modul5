import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Objects;

public class Rabatt extends Rabattstrategie{

    private double maxidisount = 0.7;
    private double mididiscount = 0.85;

    public Rabatt(double regulärpreis, LocalDate flugdatum, String flugnummer, String bezeichnung) {
        super(regulärpreis, flugdatum, flugnummer, bezeichnung);
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
            return regulärpreis;
        } else if (getFlugdatum().getMonth() == Month.FEBRUARY||getFlugdatum().getMonth() == Month.MARCH) {
            regulärpreis = regulärpreis * mididiscount;
            return regulärpreis;
        } else {

            return regulärpreis;
        }
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        if (YearMonth.from(getFlugdatum()).equals(1)||YearMonth.from(getFlugdatum()).equals(4)||YearMonth.from(getFlugdatum()).equals(10)||YearMonth.from(getFlugdatum()).equals(1)||YearMonth.from(getFlugdatum()).equals(4))
        {
            System.out.println("Rabattierterpreis: " + getReduzierterPreis(getRegulärpreis()));
        }
    }


}
