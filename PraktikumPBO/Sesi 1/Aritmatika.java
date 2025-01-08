package PraktikumPBO.Sesi1;
import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        
        // Membuat objek scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan Angka Pertama: ");
        double angka1 = input.nextDouble();
        
        System.out.print("Masukkan Angka Kedua: ");
        double angka2 = input.nextDouble();
        
        // Melakukan operasi aritmatika
        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;
        double perkalian = angka1 * angka2;
        double pembagian = angka1 / angka2;
        
        // Menampilkan hasil
        System.out.println("Hasil Penjumlahan: " + penjumlahan);
        System.out.println("Hasil Pengurangan: " + pengurangan);
        System.out.println("Hasil Perkalian: " + perkalian);
        System.out.println("Hasil Pembagian: " + pembagian);
        
        // Menutup Scanner
        input.close();
    }
}
