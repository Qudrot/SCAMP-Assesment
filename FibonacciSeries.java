public class FibonacciSeries {
    public static void fibonacciSeries(int n, int t1, int t2) {
        System.out.print("First " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(t1 + " + ");
            int sum = t2 + t1;
            t1 = t2;
            t2 = sum;
        }
    }
    public static void main(String[] args) {
        fibonacciSeries(20,0,1);
    }
}

