package codingbat.logic1;

public class TeenSum {
    public static void main(String[] args) {
        System.out.println(teenSum(3,4));
        System.out.println(teenSum(10,13));
        System.out.println(teenSum(13,2));
    }

    public static int teenSum(int a, int b) {
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 ?
            19 :
            a + b;
    }
}
