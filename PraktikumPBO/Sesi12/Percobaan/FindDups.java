package Sesi12.Percobaan;
import java.util.HashSet;
import java.util.Set;

public class FindDups {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide input words.");
            return;
        }

        Set<String> s = new HashSet<>();
        for (String a : args) {
            if (!s.add(a)) {
                System.out.println("Duplicate detected: " + a);
            }
        }

        System.out.println("Total unique words: " + s.size());
        System.out.println("Unique words: " + s);
    }
}
