package obiektowosc.duze.wykonczeniowka;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Klient {

    private int idKlienta;
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private ArrayList<Klient> allKlienci = new ArrayList<>();

    public Klient(int idKlienta, String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        allKlienci.add(this);
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(int idKlienta) {
        this.idKlienta = idKlienta;
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

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public ArrayList<Klient> getAllKlienci() {
        return allKlienci;
    }

    public void setAllKlienci(ArrayList<Klient> allKlienci) {
        this.allKlienci = allKlienci;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "idKlienta=" + idKlienta +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", allKlienci=" + allKlienci +
                '}';
    }
}
