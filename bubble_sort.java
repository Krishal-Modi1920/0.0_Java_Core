import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Input values for sorting
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter values of a[" + i + "] for Sorting: ");
            arr[i] = sc.nextInt();
        }

        int temp;
        // Bubble Sort Algorithm
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
