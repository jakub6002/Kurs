package obiektowosc.duze.wykonczeniowka;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fachowiec {
    private int idFachowca;
    private String imie;
    private String nazwisko;
    private Long nipFachowca;
    private LocalDate dataUrodzenia;
    private ArrayList<Fachowiec> allfachowcy = new ArrayList<>();

    public Fachowiec(int idFachowca, String imie, String nazwisko, Long nipFachowca, LocalDate dataUrodzenia) {
        this.idFachowca = idFachowca;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nipFachowca = nipFachowca;
        this.dataUrodzenia = dataUrodzenia;
        allfachowcy.add(this);
    }

    public int getIdFachowca() {
        return idFachowca;
    }

    public void setIdFachowca(int idFachowca) {
        this.idFachowca = idFachowca;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Long getNipFachowca() {
        return nipFachowca;
    }

    public void setNipFachowca(Long nipFachowca) {
        this.nipFachowca = nipFachowca;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public ArrayList<Fachowiec> getAllfachowcy() {
        return allfachowcy;
    }

    public void setAllfachowcy(ArrayList<Fachowiec> allfachowcy) {
        this.allfachowcy = allfachowcy;
    }

    @Override
    public String toString() {
        return "Fachowiec{" +
                "idFachowca=" + idFachowca +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nipFachowca=" + nipFachowca +
                ", dataUrodzenia=" + dataUrodzenia +
                ", allfachowcy=" + allfachowcy +
                '}';
    }
}
