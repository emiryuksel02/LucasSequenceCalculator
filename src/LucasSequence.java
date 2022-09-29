/**
 * Provides calculation methods for Lucas Sequence.
 * 
 * @author uumkp
 * @version 1.0
 */

public class LucasSequence {

    private long[] lucasNumbers;

    /**
     * Creates a new lucas sequence calculation.
     * 
     * @param n maximum index
     * @param p parameter of the sequence
     * @param q parameter of the sequence
     */

    public LucasSequence(int n, int p, int q) {

        this.lucasNumbers = new long[n + 1];
        calculateLucasSequence(n, p, q);
        lucasNumbers[0] = 0;
        lucasNumbers[1] = 1;

    }

    private long calculateLucasSequence(int n, int p, int q) {

        if (n <= 1) {
            return n;
        }

        if (lucasNumbers[n] != 0) {
            return lucasNumbers[n];
        }

        long nthNumber = (p * calculateLucasSequence(n - 1, p, q)) - (q * calculateLucasSequence(n - 2, p, q));

        lucasNumbers[n] = nthNumber;
        return nthNumber;
    }

    public long[] getLucasNumbers() {
        return lucasNumbers;
    }

    /**
     * Prints all long values from a long array.
     * 
     * @param l
     */

    public static void printAll(long[] l) {
        for (long i : l) {
            System.out.println(i);
        }
    }
}
