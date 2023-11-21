package string;

/**
 * The StringBufferAndStringBuilder class demonstrates the usage of StringBuffer
 * and StringBuilder
 * with some built-in methods in Java.
 */
public class StringBufferAndStringBuilder {

    // The main method to execute the program.
    public static void main(String[] args) {

        // Using StringBuffer
        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println("1. Capacity of StringBuffer: " + buffer.capacity());
        buffer.append("World");
        System.out.println("2. Modified StringBuffer: " + buffer);

        // Using StringBuilder
        StringBuilder builder = new StringBuilder("Java ");
        System.out.println("3. Capacity of StringBuilder: " + builder.capacity());

        // Appending to StringBuilder
        builder.append("Programming");
        System.out.println("4. Modified StringBuilder: " + builder);

        // Inserting into StringBuilder
        builder.insert(5, " is Fun ");
        System.out.println("5. Updated StringBuilder: " + builder);

        // Reversing StringBuilder
        builder.reverse();
        System.out.println("6. Reversed StringBuilder: " + builder);

        // Deleting from StringBuilder
        builder.delete(10, 17);
        System.out.println("7. StringBuilder after deletion: " + builder);

        // Converting StringBuilder to String
        String resultString = builder.toString();
        System.out.println("8. Converted StringBuilder to String: " + resultString);
    }
}
