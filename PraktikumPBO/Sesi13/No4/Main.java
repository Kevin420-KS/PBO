package PraktikumPBO.Sesi13.No4;

public class Main {
    public static void main(String[] args) {
        Mamalia kucing = new Mamalia("Kucing");
        kucing.setJenisMamalia("Karnivora");
        kucing.setJumlahKaki(4);
        kucing.setBisaJalan(true);
        
        System.out.println("Mamalia: " + kucing.getNama());
        System.out.println("Jenis Mamalia: " + kucing.getJenisMamalia());
        System.out.println("Jumlah Kaki: " + kucing.getJumlahKaki());
        System.out.println("Bisa Jalan: " + kucing.getBisaJalan());

        Ayam ayamJago = new Ayam("Ayam Jago", 5.0);
        ayamJago.setJenisAyam("Petarung");
        ayamJago.setBisaDiAdu(true);

        System.out.println("\nAves: " + ayamJago.getNama());
        System.out.println("Jenis Ayam: " + ayamJago.getJenisAyam());
        System.out.println("Bisa Diadu: " + ayamJago.getBisaDiAdu());

        Merpati merpatiPutih = new Merpati("Merpati Putih", 3.0);
        merpatiPutih.setBisaTerbang(true);

        System.out.println("\nAves: " + merpatiPutih.getNama());
        System.out.println("Bisa Terbang: " + merpatiPutih.getBisaTerbang());
    }
}
