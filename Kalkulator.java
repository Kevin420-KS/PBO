package ;//Sesuai nama file;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
        String ulang;

        do {
            // Input angka pertama
            System.out.println("Masukkan angka pertama: ");
            angka1 = input.nextDouble();

            // Input angka kedua
            System.out.println("Masukkan angka kedua: ");
            angka2 = input.nextDouble();

            // Input operator yang ingin digunakan
            System.out.println("Pilih operator yang ingin digunakan (+, -, *, /): ");
            operator = input.next().charAt(0);

            // Proses terjadinya perhitungan suatu rumus
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.println("Hasilnya: " + hasil);
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    System.out.println("Hasilnya: " + hasil);
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    System.out.println("Hasilnya: " + hasil);
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasilnya: " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol!");
                    }
                    break;
                default:
                    System.out.println("Error! Operator yang anda pilih tidak tersedia.");
                    break;
            }

            // Untuk memilih keputusan masih ingin menggunakannya atau tidak
            System.out.println("Apakah Anda ingin menghitung soal yang lain? (y/n)");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan kalkulator!");
    }
}
