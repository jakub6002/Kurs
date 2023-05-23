package Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.Predicate;



class ObjectContainer {
    private static class Node {
        Object object;
        Node next;

        Node(Object object) {
            this.object = object;
        }
    }

    private Condition warunek;
    private Node node;

    public ObjectContainer(Condition warunek) {
        this.warunek =  warunek;
        this.node = null;
    }

    public boolean dodaj(Object obiekt) {
        if (warunek.test(obiekt)) {
            Node newNode = new Node(obiekt);
            if (node == null) {
                node = newNode;
            } else {
                Node n = node;
                while (n.next != null) {
                    n = n.next;
                }
                n.next = newNode;
            }
            return true;
        }
        return false;
    }


    public void removeIf(Predicate<Object> filter) {
        Node n = node;

        Node poprzednia = null;
        while (n != null) {
            if (filter.test(n.object)) {
                if (poprzednia == null) {
                    node = n.next;
                } else {
                    poprzednia.next = n.next;
                }
            } else {
                poprzednia = n;
            }
            n = n.next;
        }
    }

    public Object[] getZFiltrowane(Predicate<Object> filter) {
        int count = 0;
        Node n = node;
        while (n != null) {
            if (filter.test(n.object)) {
                count++;
            }
            n = n.next;

        }
        Object[] wynik = new Object[count];
        n = node;
        int index = 0;
        while (n != null) {
            if (filter.test(n.object)) {
                wynik[index] = n.object;
                index++;
            }
            n = n.next;
        }
        return wynik;
    }
    public void storeToFile(String fileName, Condition filter, Formatter formatter) {
        try (PrintWriter writer = new PrintWriter("src/Test/youngPeopleFromWarsaw.txt")) {
            Node current = node;
            while (current != null) {
                if (filter.test(current.object)) {
                    String formatted = formatter.format(current.object);
                    writer.println(formatted);
                }
                current = current.next;
            }
            System.out.println("Data stored to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while storing data to file: " + e.getMessage());
        }
    }
}




