package PolymorfismeDinamis;

public class CetakGambar extends Bentuk {
    @Override
    public void gambar() {
        System.out.println("CetakGambar: Menggambar Bentuk");
    }

    @Override
    public void hapus() {
        System.out.println("CetakGambar: Menghapus Bentuk");
    }

    // Metode untuk menampilkan polimorfisme
    private void tampil(Bentuk[] obj) {
        // Menggunakan polimorfisme untuk memanggil metode gambar() dan hapus()
        for (int i = 0; i < obj.length; i++) {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("===========");
        }
    }

    public static void main(String[] args) {
        // Array Bentuk dengan objek subclass
        Bentuk[] obj = { 
            new Lingkaran(),
            new Elips(),
            new Segitiga()
        };

        // Membuat objek CetakGambar
        CetakGambar cetak = new CetakGambar();

        // Memanggil metode gambar() dan hapus() di CetakGambar
        cetak.gambar();
        cetak.hapus();
        System.out.println("=============");

        // Menampilkan metode gambar() dan hapus() dengan polimorfisme
        cetak.tampil(obj);
    }
}
