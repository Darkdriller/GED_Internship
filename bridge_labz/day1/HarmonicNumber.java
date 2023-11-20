import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N (ensure N != 0): ");
        int N = scanner.nextInt();

        if (N == 0) {
            System.out.println("N should not be zero.");
            return;
        }

        double hv = 0.0;

        for (int i = 1; i <= N; i++) {
            hv += 1.0 / i;
        }

        System.out.println("The " + N + "th Harmonic Value is: " + hv);

        scanner.close();
    }
}

