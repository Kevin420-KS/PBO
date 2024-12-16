package PraktikumPBO.Sesi12.StudiKasus;

public class LaptopAsus extends Laptop {
    public LaptopAsus(String processor, int ram) {
        super("Asus", processor, ram);
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Spesifikasi Laptop Asus:");
        super.tampilkanSpesifikasi();
    }
}
