import java.util.Random;
import java.util.Scanner;

public class CoinFlipPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = sc.nextInt();

        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int hc = 0;
        Random random = new Random();

        for (int i = 0; i < numFlips; i++) {
            if (random.nextDouble() < 0.5) {
                hc++;
            }
        }

        double hp = (double) hc / numFlips * 100;
        double tp = 100 - hp;

        System.out.println("Percentage of Heads: " + hp + "%");
        System.out.println("Percentage of Tails: " + tp + "%");

        sc.close();
    }
}
