package Sesi12.Percobaan;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {

    public static void main(String[] args) {
        // Menggunakan Vector dengan generics untuk tipe String
        Vector<String> dayNames = new Vector<>();

        // Menambahkan nama-nama hari ke dalam Vector
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        // Mendapatkan Enumeration dari elemen-elemen di Vector
        Enumeration<String> days = dayNames.elements();

        // Iterasi elemen menggunakan Enumeration
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
