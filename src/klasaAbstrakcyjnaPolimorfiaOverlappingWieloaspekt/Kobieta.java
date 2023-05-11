package klasaAbstrakcyjnaPolimorfiaOverlappingWieloaspekt;

public class Kobieta extends Osoba {

    String nazwiskoPanienskie;

    @Override
    public Double getDochody() {
        return null;
    }

    public void urodzDziecko(){
        System.out.println("Rodzę...");
    }
}
