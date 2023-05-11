package klasaAbstrakcyjnaPolimorfiaOverlappingWieloaspekt;

public class Mezczyzna extends Osoba {

    boolean sluzbaWojskowa;

    @Override
    public Double getDochody() {
        return null;
    }

    public void idzDoWojska() {
        sluzbaWojskowa = true;
    }
}
