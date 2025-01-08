package Sesi12.Percobaan;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        // Create a PriorityQueue object
        PriorityQueue<String> stringQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");

        // Remove and print elements from the PriorityQueue
        // PriorityQueue orders elements based on their natural ordering (lexicographically for Strings)
        while (stringQueue.size() > 0) {
            System.out.println(stringQueue.remove());
        }
    }
}
