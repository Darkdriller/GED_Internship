public class PowerOfTwo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowerOfTwo <N>");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N < 0 || N >= 31) {
            System.out.println("N should be in the range 0 <= N < 31.");
            return;
        }

        System.out.println("Powers of 2 less than or equal to 2^" + N + ":");
        int powerOf2 = 1;

        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + powerOf2);
            powerOf2 *= 2;
        }
    }
}

