package operators;

public class Arithmetic {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 50;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Increment
        // System.out.println("Post Increment : " + (num1++));
        // System.out.println("Pre Increment : " + (++num1));

        int numIncrement = 100;
        System.out.println("Post Increment : " + (numIncrement++));
        System.out.println("Post Increment Result : " + (++numIncrement));
    }

}
