import java.util.Scanner;

public class FindMaximum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number (A): ");
        int A = scanner.nextInt();
        System.out.print("Enter the second number (B): ");
        int B = scanner.nextInt();
        System.out.print("Enter the third number (C): ");
        int C = scanner.nextInt();
        
        int maximum = maximumOfThree(A, B, C);
        
        System.out.println("The maximum number is: " + maximum);
        
        scanner.close();
    }
    
    public static int maximumOfThree(int A, int B, int C) {
        int maxAB = (A > B) ? A : B; // find the maximum of A and B
        return (C > maxAB) ? C : maxAB; // find the maximum of the result and C
    }
}

