package Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.function.Predicate;

public class ObjectContainer<T>{
    private Predicate<T> warunek;
    private List<T> obiekty;

    public ObjectContainer(Predicate<T> warunek) {
        this.warunek = warunek;
        this.obiekty = new ArrayList<>();
    }

    public boolean dodaj(T object) {
        if (warunek.test(object)) {
            return obiekty.add(object);
        }
        return false;
    }

    public List<T> filter(Predicate<T> filter) {
        List<T> filtrowanaLsita = new ArrayList<>();
        for (T e : obiekty) {
            if (filter.test(e)) {
                filtrowanaLsita.add(e);
            }
        }
        return filtrowanaLsita;
    }

    public void removeIf(Predicate<T> filter) {
        obiekty.removeIf(filter);
    }

    public void ZapiszDoPliku(String nazwaPliku, Predicate<T> warunek, Formatter <T> formatter) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Test/youngPeopleFromWarsaw.txt"))) {
            for (T object : obiekty) {
                if (this.warunek.test(object) && warunek.test(object)) {
                    writer.write(formatter.format(object));
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    interface Formatter<T> {
        String format(T object);
    }
}



