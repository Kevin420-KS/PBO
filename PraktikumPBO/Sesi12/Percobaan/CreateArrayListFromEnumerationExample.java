package Sesi12.Percobaan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CreateArrayListFromEnumerationExample {

    public static void main(String[] args) {

        // Membuat objek Vector dengan generics untuk tipe String
        Vector<String> v = new Vector<>();

        // Menambahkan elemen ke dalam Vector
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F");

        System.out.println("Vector contains: " + v);

        // Mendapatkan Enumeration dari elemen-elemen di Vector
        Enumeration<String> e = v.elements();

        // Membuat ArrayList dari Enumeration
        ArrayList<String> aList = Collections.list(e);

        System.out.println("ArrayList contains: " + aList);
    }
}
