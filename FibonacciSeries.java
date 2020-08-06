public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0;
        int t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(t1 + " + ");
            int sum = t2 + t1;
            t1 = t2;
            t2 = sum;
        }
    }
}
