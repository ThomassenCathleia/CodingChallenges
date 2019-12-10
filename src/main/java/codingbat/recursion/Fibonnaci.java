package codingbat.recursion;

public class Fibonnaci {
    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
