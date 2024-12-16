package PraktikumPBO.Sesi4;

//Membuat Class dengan nama Bintang Film
class BintangFilm {
    //Atributnya
    private String nama;
    private Boolean pria;

    //Konstruktor: fungsi yang dijalankan ketika objek diciptakan
    BintangFilm(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    //Method tanpa return dengan parameter (opsional jika digunakan nanti)
    public void Isikan(String nama, Boolean pria) {
        this.nama = nama; //this adalah objek sekarang
        this.pria = pria;
    }
    
    //Method dengan return tanpa parameter
    String perolehNama() {
        return nama;
    }

    //Memperoleh Jenis Kelamin tanpa parameter
    String perolehJenisKelamin() {
        if (pria) 
            return "Pria";
        else
            return "Wanita";
    }
}

public class ClassBintangFilm {
    public static void main(String[] args) {
        //Buat dua objek Bintang Film siA dan siB
        BintangFilm siA = new BintangFilm("Ucup", true); // argumen ditulis langsung
        BintangFilm siB = new BintangFilm("Alice", false);

        //Menampilkan objek siA dan siB
        System.out.println("siA => " + siA.perolehNama() + ", " + siA.perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehNama() + ", " + siB.perolehJenisKelamin());
    }
}
