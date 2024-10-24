public class RopeCuttingProblem {
    public static void main(String[] args) {
        int n = 9;  // Length of the rope
        int a = 2;  // First cut length
        int b = 3;  // Second cut length
        int c = 5;  // Third cut length

        int maxPieces = getMaxPieces(n, a, b, c);
        System.out.println("Maximum number of pieces: " + maxPieces);
    }

    static int getMaxPieces(int n, int a, int b, int c) {
        // Base case: if rope length is 0, no more pieces can be cut
        if (n == 0) {
            return 0; // Successfully made cuts
        }
        // If rope length is negative, return a very small number (impossible case)
        if (n < 0) {
            return -1; // Return -1 to indicate this cut is not possible
        }

        // Recursive calls for each cut length
        int cutA = getMaxPieces(n - a, a, b, c);
        int cutB = getMaxPieces(n - b, a, b, c);
        int cutC = getMaxPieces(n - c, a, b, c);

        // Get the maximum pieces obtained from the cuts
        int maxCuts = Math.max(cutA, Math.max(cutB, cutC));

        // If maxCuts is -1, it means we couldn't make any valid cuts
        return maxCuts == -1 ? -1 : maxCuts + 1; // Add 1 for the current cut
    }
}
