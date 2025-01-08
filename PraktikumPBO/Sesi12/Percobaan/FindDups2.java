package Sesi12.Percobaan;
import java.util.HashSet;
import java.util.Set;

public class FindDups2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide input words.");
            return;
        }

        Set<String> uniques = new HashSet<>();
        Set<String> dups = new HashSet<>();
        for (String a : args) {
            if (!uniques.add(a)) {
                dups.add(a);
            }
        }

        // Destructive set-difference
        uniques.removeAll(dups);

        if (uniques.isEmpty()) {
            System.out.println("No unique words found.");
        } else {
            System.out.println("Unique words: " + uniques);
        }

        if (dups.isEmpty()) {
            System.out.println("No duplicate words found.");
        } else {
            System.out.println("Duplicate words: " + dups);
        }
    }
}
