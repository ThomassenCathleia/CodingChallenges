package codewars.kyu8;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n)
                .map(i -> (int) Math.pow(i,2))
                .sum();
    }
}
