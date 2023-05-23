package Test;

import iteracja7.typy.generryczne.kosz.generyczniee.KoszOwocow;

import java.io.OutputStream;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


//    zad.1
//Stworz klase MinMax<T ale nie zwykle T> ktora jako pola klasy pobiera instancje T max oraz T min
//    Nastepnie stworz klase MinMaxService ktora bedzie miala statyczna metode MinMax<cos tutaj> getMinAndMax(List<cos tutaj> elements) zadaniem tej metody jest zwracanie mina i maxa z listy w tym jednym obiekcie wg naturalnego porządku obiektu, klasa MinMax powinna byc generyczna i metody getMin oraz getMax powinny zwraca instancje tego co bedzie na liscie elements, czyli jak przekazemy liste stringow to getMax ma zwraca String, getMin tez stringa a jak damy liste osob to ma getMax zwraca osobe, itp itd.

//        List<Osoba> osoby = List.of(new Osoba("Jakub", null, 21), new Osoba("Waldek", null, 30), new Osoba("Karol", null, 15));
//
//        MinMax<Osoba> wynik = MinMaxService.getMinMax(osoby);
//        System.out.println("Osoba minim: " + wynik.getMin());
//        System.out.println("osoba Maximum: " + wynik.getMax());
//
//        List<String> stringos = List.of("Co", "t", "slychac");
//
//        MinMax<String> stringiTest = MinMaxService.getMinMax(stringos);
//        System.out.println("String minim: " + stringiTest.getMin());
//        System.out.println("String Maximum: " + stringiTest.getMax());
//
//        List<Integer> integers = List.of(31, 5, 0, 15 + 15, -11, -100);
//        MinMax<Integer> integerMinMax = MinMaxService.getMinMax(integers);
//        System.out.println("Int minimum:" + integerMinMax.getMin());
//        System.out.println("Int max:" + integerMinMax.getMax());


        //zad.2
//    Bez uzycia struktur danych typu kolekcje, tablice, mapy czy zapisywania do pliku, nalezy stworzyc klase ObjectContainer w taki sposob aby wykonal
//    sie ponizszy kod: (przyklad dla klasy Person (name, city, age) - ale ma dzialac dla dowolnej klasy)
//    ObjectContainer<Person> peopleFromWarsaw = new ObjectContainer(p -> p.getCity().equals("Warsaw"));//tu w konstruktorze podajemy warunek do dodawania osoby do kontenera.
//peopleFromWarsaw.add(new Person("Jan", "Warsaw", 30)); // powinno byc ok, Jan jest z warszawy
//peopleFromWarsaw.add(new Person("Weronika","Warsaw", 20)); // powinno byc tez okej, Weronika jest z warszawy
//peopleFromWarsaw.add(new Person("Waldek", "Monaco", 34));// no waldka niedoda, jest z Monaco, wiec tu powinno albo rzucic wyjatkiem, albo metoda add powinna zwrocic po prostu false - co wybierzesz to twoja decyzja.
//    //do tego ponizej mozesz juz stosowac liste, no bo masz zwrocic liste:)
//    List<Person> females = peopleFromWarsaw.getWithFilter(p -> p.getName().endsWith("a")); // zwraca nam wszystkie osoby spelniajace dany warunek.
//peopleFromWarsaw.removeIf(p -> p.getAge() > 50); // powinno nam usuwac ludzi spelniajacy dany warunek w nawiasie.
////tu naturalnie mozesz stosowac zapis do pliku bo wymaga tego polecenie
//peopleFromWarsaw.storeToFile("youngPeopleFromWarsaw.txt", p -> p.getAge() < 30, p -> p.getName()+";"+p.getAge()+";"+p.getCity());
////metoda powinna zapisac obiekty do pliku z pierwszego argumenty metody, tylko te co spelniaja drugi warunek metody, w formacie z trzeciego warunku metody.


        Condition cityCondition = object -> {
            if (object instanceof Osoba) {
                Osoba osoba = (Osoba) object;
                return osoba.getMiasto().equals("Warsaw");
            }
            return false;
        };

        ObjectContainer peopleFromWarsaw = new ObjectContainer(cityCondition);
        peopleFromWarsaw.dodaj(new Osoba("Jan", "Warsaw", 30));
        peopleFromWarsaw.dodaj(new Osoba("Weronika", "Warsaw", 20));
        peopleFromWarsaw.dodaj(new Osoba("Waldek", "Monaco", 34));

        Condition ageCondition = object -> {
            if (object instanceof Osoba) {
                Osoba osoba = (Osoba) object;
                return osoba.getWiek() < 30;
            }
            return false;
        };

        System.out.println(peopleFromWarsaw);

        Formatter formatter = object -> {
            if (object instanceof Osoba) {
                Osoba osoba= (Osoba) object;
                return osoba.getImie() + ";" + osoba.getWiek() + ";" + osoba.getMiasto();
            }
            System.out.println(object);;
            return null;
        };
        System.out.println(OutputStream.nullOutputStream());
        peopleFromWarsaw.storeToFile("youngPeopleFromWarsaw.txt", ageCondition, formatter);
    }
}









