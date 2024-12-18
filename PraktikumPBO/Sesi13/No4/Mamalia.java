package PraktikumPBO.Sesi13.No4;

class Mamalia extends Animal implements Berjalan {
    private String jenisMamalia;
    private int jumlahKaki;
    private boolean bisaJalan;

    public Mamalia(String nama) {
        super(nama);
    }

    @Override
    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    @Override
    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }
}
