/*
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid = (left + right) / 2;

        int correct = guess(mid);
        while (correct != 0) {
            if(correct == -1) {
                right = mid - 1;
            }
            else if(correct == 1) {
                left = mid + 1;
            }
            mid = (right + left) / 2;
            correct = guess(mid);
        }
        return mid;
    }
}
*/