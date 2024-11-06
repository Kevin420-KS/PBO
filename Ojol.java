public class Ojol {
    
    // Kelas Supir
    public static class Supir {
        private String noTelp;
        private String namaSupir;

        public Supir(String noTelp, String namaSupir) {
            this.noTelp = noTelp;
            this.namaSupir = namaSupir;
        }

        public String getNoTelp() {
            return noTelp;
        }

        public void setNoTelp(String noTelp) {
            this.noTelp = noTelp;
        }

        public String getNamaSupir() {
            return namaSupir;
        }

        public void setNamaSupir(String namaSupir) {
            this.namaSupir = namaSupir;
        }

        public void tampilkanInfo() {
            System.out.println("Info Supir:");
            System.out.println("Nama Supir: " + namaSupir);
            System.out.println("No Telepon: " + noTelp);
        }
    }

    // Kelas Penumpang
    public static class Penumpang {
        private String noTelp;
        private String namaPengguna;

        public Penumpang(String noTelp, String namaPengguna) {
            this.noTelp = noTelp;
            this.namaPengguna = namaPengguna;
        }

        public String getNoTelp() {
            return noTelp;
        }

        public void setNoTelp(String noTelp) {
            this.noTelp = noTelp;
        }

        public String getNamaPengguna() {
            return namaPengguna;
        }

        public void setNamaPengguna(String namaPengguna) {
            this.namaPengguna = namaPengguna;
        }

        public void tampilkanInfo() {
            System.out.println("Info Penumpang:");
            System.out.println("Nama Pengguna: " + namaPengguna);
            System.out.println("No Telepon: " + noTelp);
        }
    }

    // Method utama
    public static void main(String[] args) {
        Supir supir1 = new Supir("08123456789", "Budi");
        Penumpang penumpang1 = new Penumpang("08987654321", "Andi");

        // Menampilkan informasi supir dan penumpang
        supir1.tampilkanInfo();
        System.out.println();
        penumpang1.tampilkanInfo();
    }
}
