public class App {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static long factorial1(long n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
