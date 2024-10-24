

class PrimeFactors {
    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to get prime factors of a number
    static void printPrimeFactors(int num) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
    }

    public static void main(String[] args) {
        int number = 12;  // Example number
        System.out.print("Prime factors of " + number + ": ");
        printPrimeFactors(number);
    }
}
