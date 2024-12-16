package PraktikumPBO.Sesi2;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;

//Program SWITCH
public class LampuLaluLintas {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        System.out.println("Inputkan Warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, BERHENTI!");
                break;
            case "Kuning":
                System.out.println("Lampu kuning,Harap berhati-hati!");
                break;
            case "Hijau":
                System.out.println("Lampu hijau,Silakan jalan dan jangan langsung tekan klakson!");
                break;
            default:
                System.out.println("Warna lampu tidak ada");
                break;
        }
    }
}
