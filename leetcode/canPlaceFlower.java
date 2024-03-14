package leetcode;

public class canPlaceFlower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                Boolean left = i == 0 || flowerbed[i - 1] == 0;
                Boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                System.out.println(left);
                System.out.println(right);
                if (left == true && right == true) {
                    System.out.println(flowerbed[i] + " ");
                    flowerbed[i] = 1;
                    m++;
                }
            }

            if (m >= n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        canPlaceFlower obj = new canPlaceFlower();

        int[] flowerbed1 = { 1, 0, 0, 0, 1 };
        int n1 = 2;
        System.out.println("Result for flowerbed1: " + obj.canPlaceFlowers(flowerbed1, n1)); // should return false

        // int[] flowerbed2 = {1,0,0,0,1};
        // int n2 = 2;
        // System.out.println("Result for flowerbed2: " +
        // obj.canPlaceFlowers(flowerbed2, n2)); // should return true

    }
}
