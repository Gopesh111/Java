import java.util.Scanner;

 class Main {
    static int maxProductSubArray(int arr[]) {
        // Start by considering the first element as the initial max, min, and global max
        int maxProduct = arr[0], minProduct = arr[0], globalMax = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            
            // Calculate the potential new maximum and minimum products
            int tempMax = Math.max(current, Math.max(maxProduct * current, minProduct * current));
            minProduct = Math.min(current, Math.min(maxProduct * current, minProduct * current));
            
            // Update maxProduct with the new tempMax
            maxProduct = tempMax;

            // Update the global maximum product if maxProduct is larger
            globalMax = Math.max(globalMax, maxProduct);
        }
        
        // Return the global maximum product
        return globalMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        
        // Initialize the array to store the elements
        int[] nums = new int[n];
        
        // Read the elements into the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Calculate and print the maximum product subarray
        int answer = maxProductSubArray(nums);
        System.out.println(answer);

        sc.close();
    }
}
