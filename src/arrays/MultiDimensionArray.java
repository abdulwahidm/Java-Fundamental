package arrays;

public class MultiDimensionArray {

    public static void main(String[] args) {

        int[][] nums = {
                { 12, 23, 34, 45, 56 },
                { 98, 97, 14, 65, 40 },
                { 45, 43, 67, 99, 100 }
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
