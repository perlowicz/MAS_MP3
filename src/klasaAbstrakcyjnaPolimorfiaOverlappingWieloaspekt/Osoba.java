package klasaAbstrakcyjnaPolimorfiaOverlappingWieloaspekt;

public abstract class Osoba {

    static final Double MINIMALNA_KRAJOWA = 3200.0;
    String imie;
    String nazwisko;
    int wiek;

    public abstract Double getDochody();
}
