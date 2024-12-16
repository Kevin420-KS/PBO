package PraktikumPBO.Sesi12.StudiKasus;

public class LaptopToshiba extends Laptop {
    public LaptopToshiba(String processor, int ram) {
        super("Toshiba", processor, ram);
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Spesifikasi Laptop Toshiba:");
        super.tampilkanSpesifikasi();
    }
}
