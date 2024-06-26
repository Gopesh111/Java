public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int z = n;
        int count = 0;

        // Step 1: Count the number of digits
        while (z > 0) {
            count++;
            z /= 10;
        }

        // Step 2: Compute the sum of the digits raised to the power of the number of digits
        z = n;
        int sum = 0;
        while (z > 0) {
            int digit = z % 10;
            sum += Math.pow(digit, count);
            z /= 10;
        }

        // Step 3: Check if the sum is equal to the original number
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
