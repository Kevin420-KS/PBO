package PraktikumPBO.Sesi12.StudiKasus;

public class LaptopDell extends Laptop {
    public LaptopDell(String processor, int ram) {
        super("Dell", processor, ram);
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Spesifikasi Laptop Dell:");
        super.tampilkanSpesifikasi();
    }
}
