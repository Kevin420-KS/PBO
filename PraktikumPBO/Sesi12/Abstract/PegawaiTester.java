package PraktikumPBO.Sesi12.Abstract;

public class PegawaiTester {
    public static void main(String[] args) {
        Pegawai p = new PegawaiTetap("Januari", "1234");
        p.kirimEmail("admin@admin.com", "Masak", "Jangan lupa masak");
    }
}
