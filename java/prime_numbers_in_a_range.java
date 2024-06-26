public class prime_numbers_in_a_range {
    public static void main(String[] args) {
        int n = 10;
        
        for (int i = 2; i < n; i++) {  // Start from 2, since 1 is not a prime number
            boolean isPrime = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {  // Check divisors up to the square root of i
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
