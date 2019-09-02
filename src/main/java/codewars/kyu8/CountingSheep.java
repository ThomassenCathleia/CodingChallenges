package codewars.kyu8;

import java.util.stream.IntStream;

class CountingSheep {

    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i).append(" sheep...");
        }
        return sb.toString();
    }
}