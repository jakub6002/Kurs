package obiektowosc.duze.wykonczeniowka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {

        zaladujKlientow();
        zaladujFachowca();
    }

    public static void zaladujFachowca() throws IOException {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/obiektowosc/duze/wykonczeniowka/fachowcy"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String linia;
        while ((linia = bufferedReader.readLine()) != null) {
            String[] splitlinia = linia.split(",\t");
            Fachowiec fachowiec = new Fachowiec(Integer.parseInt(splitlinia[0]), splitlinia[1], splitlinia[2], Long.parseLong(splitlinia[3]), LocalDate.parse(splitlinia[4]));
            System.out.println(fachowiec);
        }
    }

    public static void zaladujKlientow() throws IOException {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/obiektowosc/duze/wykonczeniowka/klienci"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String linia;
        while ((linia = bufferedReader.readLine()) != null) {
            String[] splitlinia = linia.split(",\t");
            Klient klient = new Klient(Integer.parseInt(splitlinia[0]), splitlinia[1], splitlinia[2], LocalDate.parse(splitlinia[4]));
            System.out.println(klient);
        }
    }
}