public class Recursion {
    public static long calculateFactorial(long n) {
        return (n <= 1) ? 1 :
                n * calculateFactorial(n - 1);
    }
}
