package PraktikumPBO.Sesi12.Abstract;

public class StaffTester {
    public static void main(String[] args) {
        // Membuat objek Staff
        Staff s = new Staff("Januar", "1234", "Keuangan");
        
        // Menggunakan metode kirimEmail
        s.kirimEmail("a@test.com", "info test", "isi email");

        // Menampilkan informasi Staff
        System.out.println(
            "NIP    : " + s.getNIP() + "\n" +
            "Nama   : " + s.getNama() + "\n" +
            "Bagian : " + s.getBagian()
        );
    }
}
