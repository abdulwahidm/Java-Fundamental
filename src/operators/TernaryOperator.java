package operators;

public class TernaryOperator {

    boolean isAuthenticated = false;

    public void checkAuthentication() {
        // Using if-else
        if (isAuthenticated) {
            System.out.println("User is authenticated");
        } else {
            System.out.println("User is not authenticated");
        }

        // Using ternary operator
        String authenticationStatus = isAuthenticated ? "User is authenticated" : "User is not authenticated";
        String result = authenticationStatus;
        System.out.println(result);
    }

    public static void main(String[] args) {
        TernaryOperator ternaryOperator = new TernaryOperator();
        ternaryOperator.checkAuthentication();
    }
}
