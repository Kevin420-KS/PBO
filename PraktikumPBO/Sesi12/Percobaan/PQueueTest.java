package Sesi12.Percobaan;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                boolean flag1 = isPrime(int1);
                boolean flag2 = isPrime(int2);

                if (flag1 == flag2) {
                    return int1.compareTo(int2);
                } else if (flag1) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        // Add elements to the PriorityQueue
        pQueue.add(1);
        pQueue.add(5);
        pQueue.add(6);
        pQueue.add(4);
        pQueue.add(2);
        pQueue.add(9);
        pQueue.add(7);
        pQueue.add(8);
        pQueue.add(10);
        pQueue.add(3);

        // Poll elements from the PriorityQueue and print them
        while (true) {
            Integer head = pQueue.poll();
            if (head == null) {
                break;
            }
            System.out.print(head + "  <-- ");
        }
    }

    /**
     * Check if a number is prime
     *
     * @param n the number to check
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        long m = (long) Math.sqrt(n);

        for (long i = 3; i <= m; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
