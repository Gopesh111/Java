import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> findLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight); 
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i]; 
            }
        }
        Collections.reverse(leaders);;
        return leaders;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> leaders = findLeaders(arr);
        for(int x:leaders){
            System.out.print(x+" ");
        }
        scanner.close();
    }
}
