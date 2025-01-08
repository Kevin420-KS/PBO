package Sesi12.Percobaan;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Menggunakan HashSet untuk menyimpan elemen
        Set<String> set = new HashSet<>();
        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Gene");
        set.add("Elizabeth"); // Duplikat akan diabaikan
        set.add("Clara");
        
        // Menampilkan elemen pada HashSet
        System.out.print("Elemen pada HashSet: ");
        System.out.println(set);
        
        // Membuat TreeSet untuk menyortir elemen
        Set<String> sortSet = new TreeSet<>(set);
        System.out.print("Elemen pada TreeSet: ");
        System.out.println(sortSet);
    }
}
