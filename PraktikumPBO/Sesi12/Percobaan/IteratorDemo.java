package Sesi12.Percobaan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class IteratorDemo {

    public static void main(String[] args) {
        // Membuat ArrayList dengan generics untuk tipe String
        ArrayList<String> al = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Menggunakan iterator untuk menampilkan isi ArrayList
        System.out.print("Original contents of al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Memodifikasi objek dengan ListIterator
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }

        // Menampilkan isi ArrayList yang telah dimodifikasi
        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Menampilkan daftar secara terbalik menggunakan ListIterator
        System.out.print("Modified list backwards: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
