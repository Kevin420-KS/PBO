package PraktikumPBO.Sesi13.No4;

class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiAdu;

    public Ayam(String nama, double ukuran) {
        super(nama, ukuran);
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiAdu(boolean bisaDiAdu) {
        this.bisaDiAdu = bisaDiAdu;
    }

    public boolean getBisaDiAdu() {
        return bisaDiAdu;
    }
}
