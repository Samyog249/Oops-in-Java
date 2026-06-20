import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = Sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");

        long num1 = 0, num2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            long sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        Sc.close();
    }
}