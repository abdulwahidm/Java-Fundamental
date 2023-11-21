package loops;

import java.util.Scanner;

public class WhileLoopValidation {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi variabel untuk menyimpan input yang valid
        int userInput = 0;

        // Melakukan validasi input menggunakan while loop
        while (true) {
            System.out.print("Enter a positive number: ");

            // Memeriksa apakah input adalah angka
            if (scanner.hasNextInt()) {
                // Mengambil input
                userInput = scanner.nextInt();

                // Memeriksa apakah input adalah angka positif
                if (userInput > 0) {
                    break; // Keluar dari loop jika input valid
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Membersihkan buffer input
            }
        }

        // Menampilkan hasil input yang valid
        System.out.println("You entered: " + userInput);

        // Menutup Scanner untuk menghindari kebocoran sumber daya
        scanner.close();
    }
}
