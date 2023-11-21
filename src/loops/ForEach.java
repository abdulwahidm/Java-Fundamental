package loops;

public class ForEach {

    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Menggunakan foreach loop untuk mengakses nilai dalam array
        System.out.println("Values in the array:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
