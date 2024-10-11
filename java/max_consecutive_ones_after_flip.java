import java.util.Scanner;

class Main {
    // Function to find the maximum number of consecutive 1s with at most 'k' 0s flipped to 1s.
    private static int findMaxConsecutiveOnes(int a, int k) {
        // Convert the number to its binary string representation.
        String binaryString = Integer.toBinaryString(a);
        
        int maxOnes = 0; // To track the maximum consecutive 1s
        int numReplacements = 0; // To track how many 0s have been changed to 1s
        int windowStart = 0; // Start of the sliding window
        
        // Iterate through the binary string.
        for (int windowEnd = 0; windowEnd < binaryString.length(); windowEnd++) {
            // If the current bit is 0, consider changing it to 1.
            if (binaryString.charAt(windowEnd) == '0') {
                numReplacements++;    
            }
            
            // If we've changed more than 'k' 0s to 1s, shrink the window from the start.
            while (numReplacements > k) {
                if (binaryString.charAt(windowStart) == '0') {
                    numReplacements--; // Undo the change of a 0 to 1
                }
                windowStart++; // Move the window start to the right
            }
            
            // Update the maximum length of consecutive 1s.
            maxOnes = Math.max(maxOnes, windowEnd - windowStart + 1);
        }
        
        return maxOnes;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number
        int result = findMaxConsecutiveOnes(n, 1); // Find the max 1s with 1 allowed replacement
        System.out.println(result); // Output the result
        sc.close();
    }
}
