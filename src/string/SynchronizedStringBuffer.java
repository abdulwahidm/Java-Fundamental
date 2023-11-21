package string;

/**
 * Contoh penggunaan StringBuffer dalam konteks sinkron.
 */
public class SynchronizedStringBuffer {

    public static void main(String[] args) {
        // Membuat StringBuffer bersifat sinkron
        StringBuffer synchronizedBuffer = new StringBuffer();

        // Membuat dua thread yang mengakses StringBuffer bersifat sinkron
        Thread writerThread = new WriterThread(synchronizedBuffer);
        Thread readerThread = new ReaderThread(synchronizedBuffer);

        // Memulai thread
        writerThread.start();
        readerThread.start();
    }
}

/**
 * Thread untuk menulis data ke StringBuffer bersifat sinkron.
 */
class WriterThread extends Thread {
    private StringBuffer buffer;

    public WriterThread(StringBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (buffer) {
                buffer.append("A");
                System.out.println("WriterThread: Appended 'A'");
            }

            try {
                Thread.sleep(200); // Menunggu sebentar untuk menunjukkan sinkronisasi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * Thread untuk membaca data dari StringBuffer bersifat sinkron.
 */
class ReaderThread extends Thread {
    private StringBuffer buffer;

    public ReaderThread(StringBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (buffer) {
                System.out.println("ReaderThread: Read - " + buffer.toString());
                buffer.setLength(0); // Mengosongkan StringBuffer setelah membaca
            }

            try {
                Thread.sleep(200); // Menunggu sebentar untuk menunjukkan sinkronisasi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
