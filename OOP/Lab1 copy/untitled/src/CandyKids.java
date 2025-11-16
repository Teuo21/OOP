import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CandyKids {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {1, 2, 3, 1, 1};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
