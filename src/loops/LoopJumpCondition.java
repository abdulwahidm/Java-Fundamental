package loops;

import java.util.Scanner;

public class LoopJumpCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a series of numbers (enter 0 to stop):");

        int sum = 0;
        int currentNumber;

        while (true) {
            // Meminta pengguna memasukkan angka
            System.out.print("Enter a number (or 0 to stop): ");
            currentNumber = scanner.nextInt();

            // Memeriksa apakah pengguna memasukkan 0
            if (currentNumber == 0) {
                System.out.println("Stopping the loop.");
                break; // Keluar dari loop jika pengguna memasukkan 0
            }

            // Memeriksa apakah angka negatif, jika ya, skip iterasi berikutnya
            if (currentNumber < 0) {
                System.out.println("Skipping negative number.");
                continue; // Melanjutkan ke iterasi berikutnya tanpa menjalankan kode di bawahnya
            }

            // Menambahkan angka ke sum jika bukan 0 atau negatif
            sum += currentNumber;
        }

        System.out.println("Sum of the entered numbers (excluding negatives): " + sum);

        scanner.close();
    }

}
