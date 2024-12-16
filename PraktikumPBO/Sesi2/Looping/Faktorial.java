package PraktikumPBO.Sesi2.Looping;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        int faktorial = 1;
        int i = angka;

        //Looping while untuk menghitung faktorial
        while (i > 0){
            faktorial *= i;
            i--;
        }
        System.out.println("Faktorial dari "+ angka + "adalah " + faktorial);
    }
}
