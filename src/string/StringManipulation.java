package string;

;

//The StringManipulation class demonstrates string manipulation using various built-in methods in Java.

public class StringManipulation {

    // The main method to execute the program.
    public static void main(String[] args) {

        // Using String Literal
        String str1 = "Hello ";
        System.out.println("1. " + str1);

        // Using String Object
        String str2 = new String("World");
        System.out.println("2. " + str2);

        // Concatenating String Literal and String Object
        String str3 = str1 + str2;
        System.out.println("3. " + str3 + "!");

        // Getting the length of the string
        int length = str3.length();
        System.out.println("4. Length of the string: " + length);

        // Converting to uppercase
        String uppercaseStr = str3.toUpperCase();
        System.out.println("5. Uppercase: " + uppercaseStr);

        // Converting to lowercase
        String lowercaseStr = str3.toLowerCase();
        System.out.println("6. Lowercase: " + lowercaseStr);

        // Checking if the string contains a specific substring
        boolean containsWorld = str3.contains("World");
        System.out.println("7. Contains the word 'World': " + containsWorld);

        // Replacing characters in the string
        String replacedStr = str3.replace('o', '0');
        System.out.println("8. After replacing characters: " + replacedStr);

        // Trimming whitespace from the string
        String stringWithWhitespace = "   Trim Me   ";
        String trimmedStr = stringWithWhitespace.trim();
        System.out.println("9. Trimmed string: " + trimmedStr);

        // Checking if the string starts with "Hello"
        boolean startsWithHello = str3.startsWith("Hello");
        System.out.println("10. Starts with 'Hello': " + startsWithHello);

        // Extracting a substring
        String substring = str3.substring(6, 11);
        System.out.println("11. Substring: " + substring);
    }
}
