import java.util.Scanner;

public class sieve_Of_Eratosthenes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean[] isPrime = new boolean[n + 1];

        // Assume all numbers are prime initially
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Sieve logic
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
