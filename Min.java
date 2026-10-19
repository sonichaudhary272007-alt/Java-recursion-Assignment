
import java.util.Scanner;

public class Min {

    static int findMin(int[] arr, int index) {
        // Base condition
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Find minimum in the remaining array
        int min = findMin(arr, index + 1);

        // Compare current element with remaining minimum
        return Math.min(arr[index], min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMin(arr, 0));

        sc.close();
    }
}
