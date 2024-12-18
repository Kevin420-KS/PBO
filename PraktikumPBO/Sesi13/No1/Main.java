package PraktikumPBO.Sesi13.No1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Rektor
        Rektor rektor = new Rektor("123", "Prof. Ucup", 2015);
        System.out.println("Data Rektor:");
        rektor.viewRektor();
        System.out.println();

        // Membuat objek Dekan
        Dekan dekan = new Dekan("456", "Dr. Asep", "Fakultas Teknik");
        System.out.println("Data Dekan:");
        dekan.viewDekan();
    }
}
