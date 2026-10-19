import java.util.Scanner;
public class Linear_Search {

    static int linearSearch(int[] arr, int index, int x) {
        if (index == arr.length) {
            return -1;
        }

        // Target found: return first occurrence
        if (arr[index] == x) {
            return index;
        }

        // Search the next index
        return linearSearch(arr, index + 1, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(linearSearch(arr, 0, x));

        sc.close();
    }
}
 
