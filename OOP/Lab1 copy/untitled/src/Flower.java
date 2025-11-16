public class Flower {
    static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int length = flowerbed.length;
            for(int i = 0; i < length; i++){
                int leftNeighbour =  (i == 0) ? 0 : flowerbed[i-1];
                int rightNeighbour =  (i == length-1) ? 0 : flowerbed[i+1];

                if (leftNeighbour + flowerbed[i] +rightNeighbour == 0) {
                    flowerbed[i] = 1;
                    --n;
                }
            }
            return n <= 0;
        }
    }
    public static void main(String[] args) {
        int n = 1;
        int[] flowerbed = {1, 0, 0, 0, 1};
        Solution sol = new Solution();
        System.out.println(sol.canPlaceFlowers(flowerbed, n));
    }
}
