package string;

/**
 * Contoh penggunaan StringBuffer dan StringBuilder dengan waktu pengukuran.
 */
public class StringBufferVsStringBuilderPerformance {

    public static void main(String[] args) {
        int iterations = 1000000; // Jumlah iterasi

        // Mengukur waktu untuk StringBuffer
        long startTimeBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("A");
        }
        long endTimeBuffer = System.currentTimeMillis();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("StringBuffer Time: " + durationBuffer + " ms");

        // Mengukur waktu untuk StringBuilder
        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("A");
        }
        long endTimeBuilder = System.currentTimeMillis();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("StringBuilder Time: " + durationBuilder + " ms");
    }
}
