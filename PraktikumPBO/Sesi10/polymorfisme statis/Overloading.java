public class Overloading {
    // Method tanpa parameter
    public void Tampil() {
        System.out.println("I love Java");
    }

    // Method dengan satu parameter
    public void Tampil(int i) {
        System.out.println("Method dengan 1 parameter = " + i);
    }

    // Method dengan dua parameter
    public void Tampil(int i, int j) {
        System.out.println("Method dengan 2 parameter = " + i + " & " + j);
    }

    // Method dengan parameter String
    public void Tampil(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas Overloading
        Overloading objek = new Overloading();

        // Memanggil metode yang di-overload
        objek.Tampil();
        objek.Tampil(8);
        objek.Tampil(6, 7);
        objek.Tampil("Hello World");
    }
}
