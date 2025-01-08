package PraktikumPBO.Sesi2;

import java.util.Scanner;  
//Program IF degnan 2 kondisi
public class CekKelulusan {
    public static void main(String[] args) {
        //Membuat variabel dan scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);  
        //Mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();  
        
        System.out.print("Nilai: ");
        nilai = Integer.parseInt(scan.nextLine());  
        //cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus.");
        } else {
            System.out.println("Maaf " + nama + ", anda tidak lulus.");
        }
        
        scan.close();  
    }
}
