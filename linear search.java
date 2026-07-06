import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to search
        int num = sc.nextInt();

        int index = -1;

        // Linear Search
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        sc.close();
    }
}
