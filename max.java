
import java.util.Scanner;

public class max {

    static int findMax(int[] arr, int index) {
        // Base condition
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Find maximum in the remaining array
        int max = findMax(arr, index + 1);

        // Compare current element with remaining maximum
        return Math.max(arr[index], max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMax(arr, 0));

        sc.close();
    }
}
