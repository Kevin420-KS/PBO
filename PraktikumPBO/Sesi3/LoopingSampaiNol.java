package PraktikumPBO.Sesi3;

import java.util.Scanner;

public class LoopingSampaiNol {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);
        double angka;

        // Meminta input dari user sampai angka 0 dimasukkan
        do {
            System.out.print("Masukkan sebuah angka (Masukkan angka 0 untuk berhenti): ");
            angka = scanner.nextDouble();
        } while (angka != 0);

        // Menutup scanner
        System.out.println("Program berhenti karena Anda memasukkan angka 0.");
        scanner.close();
    }
}
