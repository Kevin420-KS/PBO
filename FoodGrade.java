package Sesuai nama file folder;
import java.util.Scanner;

public class FoodGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade;
        
        // For loop untuk menampilkan daftar food grade
        System.out.println("Daftar Food Grade:");
        for (char g = 'A'; g <= 'D'; g++) {
            System.out.println("Grade " + g);
        }

        // While loop untuk memastikan user memasukkan nilai yang valid
        while (true) {
            System.out.print("\nMasukkan food grade (A, B, C, D): ");
            grade = input.next().charAt(0);
            
            // Mengecek apakah nilai yang dimasukkan valid (A-D)
            if (grade >= 'A' && grade <= 'D') {
                break;  // Keluar dari loop jika nilai valid
            } else {
                System.out.println("Input tidak valid, silakan masukkan grade yang benar (A, B, C, D).");
            }
        }

        // Do while loop untuk menampilkan penjelasan dari food grade
        do {
            switch (grade) {
                case 'A':
                    System.out.println("Makanan ini murni dari peternakan/kebun.");
                    break;
                case 'B':
                    System.out.println("Makanan ini ada campuran antara peternakan dan zat kimia.");
                    break;
                case 'C':
                    System.out.println("Makanan ini murni campuran beberapa zat kimia.");
                    break;
                case 'D':
                    System.out.println("Makanan ini tidak layak untuk dikonsumsi.");
                    break;
                default:
                    System.out.println("Grade tidak dikenali.");
            }
        } while (false); // Do while untuk memastikan minimal satu kali berjalan

        input.close();
    }
}
