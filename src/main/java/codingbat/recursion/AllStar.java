package codingbat.recursion;

public class AllStar {
    public String allStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.substring(0,1) + "*" + allStar(str.substring(1));
    }
}
