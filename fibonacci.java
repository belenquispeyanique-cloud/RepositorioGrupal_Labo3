import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long a = 0, b = 1;

        while (a <= n) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }
}