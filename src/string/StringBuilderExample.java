package string;

/**
 * Kelas StringBuilderExample menunjukkan penggunaan StringBuilder dalam situasi
 * di mana operasi string
 * yang dapat diubah (mutable) diperlukan dan tidak memerlukan keamanan thread.
 */
public class StringBuilderExample {

    /**
     * Metode utama untuk menjalankan program.
     */
    public static void main(String[] args) {
        // Membuat objek StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello ");

        // Menambahkan pada StringBuilder
        stringBuilder.append("World");
        System.out.println("1. StringBuilder setelah penambahan: " + stringBuilder);

        // Menyisipkan pada StringBuilder
        stringBuilder.insert(6, "Java ");
        System.out.println("2. StringBuilder setelah penyisipan: " + stringBuilder);

        // Membalik StringBuilder
        stringBuilder.reverse();
        System.out.println("3. StringBuilder yang dibalik: " + stringBuilder);

        // Menghapus dari StringBuilder
        stringBuilder.delete(6, 11);
        System.out.println("4. StringBuilder setelah penghapusan: " + stringBuilder);

        // Mengonversi StringBuilder ke String
        String hasilString = stringBuilder.toString();
        System.out.println("5. StringBuilder dikonversi ke String: " + hasilString);
    }
}
