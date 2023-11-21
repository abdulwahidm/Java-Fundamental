package loops;

public class FizzBuzzTernaryOperator {

    public static void main(String[] args) {

        // 1. First Solution
        // for (int i = 1; i <= 100; i++) {
        // String output = "";

        // if (i % 3 == 0) {
        // output += "Fizz";
        // }
        // if (i % 5 == 0) {
        // output += "Buzz";
        // }
        // if (output.isEmpty()) {
        // output = Integer.toString(i);
        // }
        // System.out.println(output);
        // }

        // 2. Second Solution
        // for (int i = 1; i <= 100; i++) {
        // if (i % 3 == 0 && i % 5 == 0) {
        // System.out.println("FizzBuzz");
        // } else if (i % 3 == 0) {
        // System.out.println("Fizz");
        // } else if (i % 5 == 0) {
        // System.out.println("Buzz");
        // } else {
        // System.out.println(i);
        // }
        // }

        // 3. Ternary Operator
        for (int i = 1; i <= 100; i++) {
            String output = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz"
                    : (i % 3 == 0) ? "Fizz"
                            : (i % 5 == 0) ? "Buzz"
                                    : Integer.toString(i);

            System.out.println(output);
        }
    }

}
