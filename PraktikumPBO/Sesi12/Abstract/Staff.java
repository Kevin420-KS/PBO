package PraktikumPBO.Sesi12.Abstract;

public class Staff extends Pegawai {  
    private String bagian;

    // Konstruktor Staff dengan inisialisasi nama, NIP, dan bagian
    public Staff(String nama, String NIP, String bagian) {  
        super(nama, NIP);
        setBagian(bagian);
    }

    // Setter untuk bagian
    public void setBagian(String namabagian) {  
        bagian = namabagian;
    }

    // Getter untuk bagian
    public String getBagian() {
        return bagian;
    }
}
