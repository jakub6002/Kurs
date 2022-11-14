package obiektowosc.duze.wykonczeniowka;


import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;

public class Wykonczenie {

    private Fachowiec idFachowca;
    private Klient idKlienta;
    private int cena;
    private boolean fakturaTrueFalse;
    private Duration czasPracy;

    private ArrayList<Wykonczenie> wykoneczenia = new ArrayList<>();

    public Wykonczenie(Fachowiec idFachowca, Klient idKlienta, int cena, boolean fakturaTrueFalse, Duration czasPracy) {
        this.idFachowca = idFachowca;
        this.idKlienta = idKlienta;
        this.cena = cena;
        this.fakturaTrueFalse = fakturaTrueFalse;
        this.czasPracy = czasPracy;
        wykoneczenia.add(this);
    }

    public Fachowiec getIdFachowca() {
        return idFachowca;
    }

    public void setIdFachowca(Fachowiec idFachowca) {
        this.idFachowca = idFachowca;
    }

    public Klient getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(Klient idKlienta) {
        this.idKlienta = idKlienta;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public boolean isFakturaTrueFalse() {
        return fakturaTrueFalse;
    }

    public void setFakturaTrueFalse(boolean fakturaTrueFalse) {
        this.fakturaTrueFalse = fakturaTrueFalse;
    }

    public Duration getCzasPracy() {
        return czasPracy;
    }

    public void setCzasPracy(Duration czasPracy) {
        this.czasPracy = czasPracy;
    }

    public ArrayList<Wykonczenie> getWykoneczenia() {
        return wykoneczenia;
    }

    public void setWykoneczenia(ArrayList<Wykonczenie> wykoneczenia) {
        this.wykoneczenia = wykoneczenia;
    }

    @Override
    public String toString() {
        return "Wykonczenie{" +
                "idFachowca=" + idFachowca +
                ", idKlienta=" + idKlienta +
                ", cena=" + cena +
                ", fakturaTrueFalse=" + fakturaTrueFalse +
                ", czasPracy=" + czasPracy +
                ", wykoneczenia=" + wykoneczenia +
                '}';
    }
}
