package Test;

public class Osoba implements Comparable<Osoba> {

    private String imie;

    private String miasto;
    private int wiek;


    public Osoba(String imie, String miasto, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.miasto = miasto;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getImie() {
        return imie;
    }


    public int getWiek() {
        return wiek;
    }


    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", miasto='" + miasto + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public int compareTo(Osoba o) {
        return 0;
    }
}
