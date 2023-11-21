package operators;

public class BitwiseOperator {

    /**
     * Bitwise operators are operators that operate at the bit-by-bit level.
     * They are used to perform logical operations and calculations on each bit of
     * avalue.
     * Bitwise operators can be used with numeric data types such as int, long,
     * short, char, and byte.
     * Here are the commonly used bitwise operators:
     */

    public static void main(String[] args) {
        int a = 5; // Representasi biner: 0101
        int b = 3; // Representasi biner: 0011

        // Bitwise AND
        int resultAND = a & b; // 0101 & 0011 = 0001
        System.out.println("Bitwise AND: " + resultAND);

        // Bitwise OR
        int resultOR = a | b; // 0101 | 0011 = 0111
        System.out.println("Bitwise OR: " + resultOR);

        // Bitwise XOR
        int resultXOR = a ^ b; // 0101 ^ 0011 = 0110
        System.out.println("Bitwise XOR: " + resultXOR);

        // Bitwise NOT
        int resultNOT = ~a; // ~0101 = 1010 (dalam representasi signed integer)
        System.out.println("Bitwise NOT: " + resultNOT);

        // Left Shift
        int leftShiftResult = a << 2; // 0101 << 2 = 10100
        System.out.println("Left Shift: " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 1; // 0101 >> 1 = 0010
        System.out.println("Right Shift: " + rightShiftResult);

        // Zero-fill Right Shift
        int zeroFillRightShiftResult = a >>> 1; // 0101 >>> 1 = 0010
        System.out.println("Zero-fill Right Shift: " + zeroFillRightShiftResult);
    }
}
