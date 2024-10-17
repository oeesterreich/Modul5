import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Angebot angebot = new Rabatt(200.0, LocalDate.of(2024,2,14),"3323","Flug nach Dubai");
        angebot.anzeigen();
    }
}