package klasaAbstrakcyjnaPolimorfiaOverlappingWieloaspekt;

public class Pracownik extends Osoba {

    String badaniaLekarskie;
    Double pensja;

    @Override
    public Double getDochody() {
        return MINIMALNA_KRAJOWA + pensja;
    }

    public Double getPensja() {
        return pensja;
    }
}
