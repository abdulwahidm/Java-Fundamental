package loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        // Creating a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Using a for loop to print numbers from 0 to n
        System.out.println("Numbers from 0 to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        // Closing the Scanner to avoid resource leak
        input.close();
    }
}
