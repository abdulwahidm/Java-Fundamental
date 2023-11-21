package loops;

import java.util.Scanner;

public class DoWhileLoopValidation {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi variabel untuk menyimpan input yang valid
        int userInput;

        // Melakukan validasi input menggunakan do-while loop
        do {
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
        } while (true);

        // Menampilkan hasil input yang valid
        System.out.println("You entered: " + userInput);

        // Menutup Scanner untuk menghindari kebocoran sumber daya
        scanner.close();
    }
}
