package conditions;

public class IfElseIfElse {

    public static void main(String[] args) {

        float sellingPrice = 1200, costPrice = 1000;

        if (sellingPrice > costPrice) {
            System.out.println("Profit");
        } else if (sellingPrice < costPrice) {
            System.out.println("Loss");
        } else {
            System.out.println("No Profit, No Loss");
        }

    }
}
