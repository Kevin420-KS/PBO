package Sesi12.Percobaan;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // Menggunakan generics untuk tipe data String
        List<String> list = new ArrayList<>();
        list.add("Bernadine");
        list.add("Elizabeth");
        list.add("Gene");
        list.add("Elizabeth");
        list.add("Clara");

        // Menampilkan isi list
        System.out.println("List: " + list);

        // Mengakses elemen berdasarkan indeks
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Element at index 0: " + list.get(0));

        // Menggunakan LinkedList dengan generics untuk tipe data String
        LinkedList<String> queue = new LinkedList<>();
        queue.addFirst("Bernadine");
        queue.addFirst("Elizabeth");
        queue.addFirst("Gene");
        queue.addFirst("Elizabeth");
        queue.addFirst("Clara");

        // Menampilkan isi LinkedList
        System.out.println("Queue: " + queue);

        // Menghapus elemen terakhir sebanyak dua kali
        queue.removeLast();
        queue.removeLast();

        // Menampilkan isi LinkedList setelah penghapusan
        System.out.println("Queue after removals: " + queue);
    }
}
