package operators;

public class RelationalOperator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int num3 = 7;

        // Lebih besar dari (>)
        System.out.println("num1 > num2 : " + (num1 > num2));

        // Lebih kecil dari (<)
        System.out.println("num1 < num3 : " + (num1 < num3));

        // Sama dengan (==)
        System.out.println("num1 == num3 : " + (num1 == num3 + num2));

        // Tidak sama dengan (!=)
        System.out.println("num2 != num3 : " + (num2 != num3));

        // Lebih besar dari atau sama dengan (>=)
        System.out.println("num1 >= num3 : " + (num1 >= num3));

        // Lebih kecil dari atau sama dengan (<=)
        System.out.println("num2 <= num3 : " + (num2 <= num3));
    }
}
