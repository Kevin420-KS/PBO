package Latihan;
import java.util.HashSet;
import java.util.Set;

public class LatihanSet {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        // Menambahkan elemen ke himpunan A dan B
        for (int i = 1; i <= 5; i++) {
            A.add(i);
        }
        for (int i = 5; i <= 10; i++) {
            B.add(i);
        }

        // Menampilkan A
        System.out.println("A: " + A);

        // Menampilkan B
        System.out.println("B: " + B);

        // A ∩ B (irisan)
        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("A ∩ B: " + intersection);

        // A U B (gabungan)
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("A U B: " + union);

        // A - B (selisih)
        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println("A - B: " + difference);
    }
}
