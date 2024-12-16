package PraktikumPBO.Sesi3;

public class LoopingBilanganGenap {
    public static void main(String[] args) {
        int jumlahGenap = 0;

        // Menggunakan perulangan for untuk menghitung bilangan genap dari 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                jumlahGenap += i; // Menambahkan bilangan genap ke total
            }
        }

        // Menampilkan hasil jumlah bilangan genap
        System.out.println("Jumlah bilangan genap antara 1 hingga 100 adalah: " + jumlahGenap);
    }
}
