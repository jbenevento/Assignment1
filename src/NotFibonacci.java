public class NotFibonacci {

    public static long[] notFibonacci(int n) {

        long[]sequence = new long[n];

        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 2; i < n; ++i) { //starting at i = 2 produces n-2 terms because the first 2 terms are already declared

            double newTerm = (3 * sequence[i-1]) + (2 * sequence[i-2]);
            sequence[i] = (long) Math.floor(newTerm);
        }

        return sequence;
    }

    public static void main(String[] args) {
        int n = 1200; // Number of terms

        long[] result = NotFibonacci.notFibonacci(n);

        System.out.println("Not Fibonacci up to " + n + " terms:");

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            if (i < result.length -1) {
                System.out.print(", ");
            }

        }
    }
}


/*
Sources:
Google Fibonacci Sequence for reference
Google AI Overview to help with Math.floor()
ChatGPT for debugging output format
 */