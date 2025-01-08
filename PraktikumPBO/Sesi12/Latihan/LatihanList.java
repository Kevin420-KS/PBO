package Latihan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatihanList {
    public static void main(String[] args) {
        // Membuat List dengan elemen String
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Menampilkan data pada list
        System.out.println("List awal: " + list);

        // Membalik data
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        System.out.println("List dibalik: " + reversedList);

        // Mengacak data
        List<String> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("List diacak: " + shuffledList);

        // Mengurutkan data
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println("List diurutkan: " + sortedList);
    }
}
