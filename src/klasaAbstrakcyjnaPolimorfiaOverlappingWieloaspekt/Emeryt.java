package klasaAbstrakcyjnaPolimorfiaOverlappingWieloaspekt;

public class Emeryt extends Osoba {

    Double emerytura;

    @Override
    public Double getDochody() {
        return MINIMALNA_KRAJOWA + emerytura;
    }

    public Double getEmerytura() {
        return emerytura;
    }

    @Override
    public String toString() {
        return "Emeryt{" +
                "emerytura=" + emerytura +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
