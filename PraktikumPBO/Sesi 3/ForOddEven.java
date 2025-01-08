package PraktikumPBO.Sesi3;

import java.util.Scanner; 

public class ForOddEven {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan batas bawah
        System.out.print("Masukkan batas bawah: ");
        int batasBawah = input.nextInt();

        // Meminta pengguna untuk memasukkan batas atas
        System.out.print("Masukkan batas atas: ");
        int batasAtas = input.nextInt();

        // Menampilkan bilangan genap dalam rentang batasBawah hingga batasAtas
        System.out.println("Bilangan genap:");
        for (int i = batasBawah; i <= batasAtas; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // Menampilkan bilangan ganjil dalam rentang batasBawah hingga batasAtas
        System.out.println("\nBilangan ganjil:");
        for (int i = batasBawah; i <= batasAtas; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // Menutup scanner
        input.close();
    }
}
