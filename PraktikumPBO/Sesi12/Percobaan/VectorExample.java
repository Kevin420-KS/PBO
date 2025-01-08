package Sesi12.Percobaan;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        // Membuat Vector dengan generics untuk tipe String
        Vector<String> vc = new Vector<>();

        // Menambahkan elemen ke Vector
        vc.add("Vector Object 1");
        vc.add("Vector Object 2");
        vc.add("Vector Object 3");
        vc.add("Vector Object 4");
        vc.add("Vector Object 5");

        // Menambahkan elemen ke posisi tertentu di Vector
        vc.add(3, "Element at fixed position");

        // Menampilkan ukuran Vector
        System.out.println("Vector Size: " + vc.size());

        // Menampilkan elemen-elemen di dalam Vector
        for (int i = 0; i < vc.size(); i++) {
            System.out.println("Vector Element " + i + ": " + vc.get(i));
        }
    }
}
