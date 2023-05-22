package iteracja7.lambdy.zadania;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        // replaceAll, transform, forEach, computeIfAbsent, computeIfPresent, removeIf(musi byc zadeklarowana lista)

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, -5, 2, 1));

        System.out.println(-5%10);
        System.out.println(intyMniejszeOd2(lista, 0));
        System.out.println(filtruj1(lista, 1));
        String wyraz = "cos ktos itd";
        String[]tablica = wyraz.split(" ");
        Arrays.asList(tablica);
        Arrays.asList("cos","ktos");
    }
    // napisz metode która kaazda liczbbe z listy zastpeuje liczba 2 * wieksza

    public static List<Integer> podwajanie(List<Integer> list) {
        list.replaceAll(i -> i * 2);
        return list;
    }

    // napisz metode która kazda liczbe z listy mnozy przez sama siebie
    public static List<Integer> mnozeniePrzezSiebie(List<Integer> list) {
        list.replaceAll(i -> i * i);
        return list;
    }

    // napisz metode która do kazdego stringa z listy dodaje * na koncu

    public static List<String> dodajDoStringa(List<String> list) {
        list.replaceAll(s -> s + "*");
        return list;
    }

    // napisz metode która zwroci nam z listy intów wszystkie te które sa
    // wieksze od 0
    public static List<Integer> intyMniejszeOd(List<Integer> list, int mniejszeOd) {
        return list.stream().filter(i -> i > mniejszeOd).toList();
    }

    // remove IF
    // napisz metode która wyfiltruje nam z listy intów wszystkie te które sa
    // mniejsze od 0
    public static List<Integer> intyMniejszeOd2(List<Integer> list, int mniejszeOd) {
        list.removeIf(i -> i < mniejszeOd);
        return list;
    }


    // napisz metode która wyfiltruje nam z listy intów wszystkie te które koncza
    // sie na liczbe podana jako parametr metody
    public static List<Integer> filtruj(List<Integer> list, int digit) {
        return list.stream()
                .filter(num -> num % 10 == digit)
                .toList();

    }

    public static List<Integer> filtruj1(List<Integer> list, int digit) {

        list.removeIf(integer -> integer % 10 == digit);
        return list;
    }




    // napisz metode ktora kazdego danego stringa z listy zastapi go potrojonym
    // stringiem, np
    // hello -> hellohellohello
    public static List<String> doubleString(List<String> list) {
        list.replaceAll(str -> str.repeat(3));
        return list;
    }

    // napisz metode która dla kazdego stringa dodaje y na poczatku i na koncu

    public static List<String> add(List<String> list) {
        list.replaceAll(str -> "y" + str + "y");
        return list;
    }

    // napisz metode ktora wszystkie elementy z listy zastepuje malymi literami
    public static List<String> maleLitery(List<String> list) {
        list.replaceAll(String::toLowerCase);
        return list;
    }

    // napisz metode która wyrzuci z listy intow elementy ktore sa z przedzialu od a
    // do b (a i b to parametry metody)
    public static List<Integer> intyZPrzedzialu(List<Integer> list, int a, int b) {
        list.removeIf(integer -> integer >= a && integer <=b);
        return list;
    }

    // napisz metode która zwroci z listy intow elementy ktore sa z przedzialu od a
    // do b (a i b to parametry metody)
    public static List<Integer> intyZPrzedzialuFiltr(List<Integer> list, int a, int b) {
           return list.stream().filter(integer ->integer >= a && integer <=b ).toList();
    }

    // napisz metode ktora z listy stringów wyswietli tylko te które posiadaja a
    public static List<String> stringiTylkoZA(List<String> list, char znak) {
        return list.stream().filter(s -> s.contains(String.valueOf(znak))).toList();
    }

    // napisz metode która sortuje liczby rosnaco z uzyciem metody list.sort()
    public static List<Integer> sortowanieRosnaco(List<Integer> list){
        list.sort(Comparator.comparing(Integer::intValue));
        return list;
    }

    // napisz metode która sortuje liste odwrotnie po dlugosci z uzyciem metody
    // list.sort()
    public static List<String> sortowanieMalejaco(List<String> list){
        list.sort(Comparator.comparing(String::length).reversed());
        return list;
    }



    // napisz metode która dla podanej listy doubli zwraca liste zawierajaca
    // pierwiastki liczby z pierwotnej listy

    public static List<Double> pierwiastkiLiczby(List<Double> listaDoubli) {
        listaDoubli.replaceAll(Math::sqrt);
        return listaDoubli;
    }

    // napisz metode która dla podanego klucza zwieksza jego wartosc o 100 jesli
    // klucz istnieje

    public static Map<String, Integer> zwiekszanieWartosci(Map<String, Integer> map, String s){
        map.computeIfPresent(s, (k, v) -> v + 100);
        return map;
    }

    // napisz metode ktora dla podanego klucza ustawia wartosc 5000 jesli klucz nie
    // istnieje
    public static Map<String, Integer> ustawianieWartosci(Map<String, Integer> map, String s){
        map.putIfAbsent(s, 5000);
        return map;
    }

    // napisz metode ktora wyswietli cała liste bez uzywania petli oraz bez [,]
    public static void listaBezPetliitp(List<Integer>list){
        list.forEach(System.out::println);
//        list.forEach(i -> System.out.println(i));
    }

    // napisz metode która ze stringa w ktorym wyrazy sa rozdzielone przecinkiem
    // tworzy liste tych wyrazow
    public static List<String> listaNowychWyrazow ( String s) {
        return new ArrayList<>(Arrays.asList(s.split(",")));

    }


}
