package arrays;

public class SingleDimensionArray {

    public static void main(String[] args) {

        // Declaring an array and initialize each elemen
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;

        // Iterasi array dan mencetak nilai
        System.out.println("Isi array nums:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("index " + i + ": " + nums[i]);
        }

        System.out.println("===================");

        // Inisialisasi array langsung
        String[] alphabet = { "A", "B", "C", "D", "E" };
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
        }

    }

}
