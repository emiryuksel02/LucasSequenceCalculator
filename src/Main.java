/**
 * This program calculates a lucas sequence recursive with variables given with
 * command line. As the output it prints all the calculated elements.
 * 
 * @author uumkp
 * @version 1.0
 */

public final class Main {
    private static final String ERROR_MESSAGE = "Error: The number of arguments should be 3. ";

    private Main() {

    }

    /**
     * Main entry point to the app.
     * 
     * @param args command line argument
     */

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println(ERROR_MESSAGE);
            return;
        }

        int n = Integer.valueOf(args[0]);
        int p = Integer.valueOf(args[1]);
        int q = Integer.valueOf(args[2]);
        LucasSequence sequence = new LucasSequence(n, p, q);
        LucasSequence.printAll(sequence.getLucasNumbers());
    }

}