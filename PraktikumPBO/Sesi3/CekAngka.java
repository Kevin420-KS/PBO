package PraktikumPBO.Sesi3;

import java.util.Scanner;

public class CekAngka {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Meminta user memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        double angka = scanner.nextDouble();

        // Memeriksa apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka tersebut bernilai positif.");
        } else if (angka < 0) {
            System.out.println("Angka tersebut bernilai negatif.");
        } else {
            System.out.println("Angka tersebut hasilnya nol.");
        }

        // Menutup scanner
        scanner.close();
    }
}
