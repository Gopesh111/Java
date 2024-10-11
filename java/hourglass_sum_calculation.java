import java.util.Scanner;

class Main {
    
    static int findMaxHourglassSum(int[][] mat, int row, int col) {
        // Check if the matrix is too small for an hourglass
        if (row < 3 || col < 3) {
            System.out.println("Matrix too small for hourglass pattern.");
            return Integer.MIN_VALUE;
        }

        int max_sum = Integer.MIN_VALUE;

        // Loop through possible top-left corners of hourglasses
        for (int i = 0; i <= row - 3; i++) {
            for (int j = 0; j <= col - 3; j++) {
                // Calculate the sum of the current hourglass
                int current_sum = mat[i][j] + mat[i][j+1] + mat[i][j+2] +
                            mat[i+1][j+1] + 
                                mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];
                
                // Update the maximum sum found
                max_sum = Math.max(max_sum, current_sum);
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        // Input matrix elements
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find and print the maximum hourglass sum
        int result = findMaxHourglassSum(matrix, rows, cols);
        if (result != Integer.MIN_VALUE) {
            System.out.println("Maximum Hourglass Sum: " + result);
        }
        scanner.close();
    }
}
