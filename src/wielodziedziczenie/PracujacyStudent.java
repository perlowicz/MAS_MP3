package wielodziedziczenie;

public class PracujacyStudent implements Student, Pracownik{
    @Override
    public void pracuj() {
        System.out.println("Studiuję...");
    }

    @Override
    public void studiuj() {
        System.out.println("Pracuję...");
    }
}
