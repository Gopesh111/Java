import java.util.Scanner;

class Main {
	static int findMaxSum(int arr[], int n){
	    int sum=0;
		for (int num : arr) {
            sum += num;
        } 
        
		int prefix_sum = 0,
		int res = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++)
		{
			prefix_sum += arr[i];
			
			if (prefix_sum == sum)
				res = Math.max(res, prefix_sum);
			sum -= arr[i];
		}
		return res;
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = findMaxSum(arr,n);
        if (result != Integer.MIN_VALUE) {
            System.out.println(result);
        } 
        else {
            System.out.println("No equilibrium sum found.");
        }
    scanner.close();
	}
}
