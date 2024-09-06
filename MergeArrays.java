import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        
        int arr[] = new int[n];
        int brr[] = new int[m];
        int crr[] = new int[n + m];

        System.out.println("Enter the numbers in the first array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the numbers in the second array:");
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        // Merging the first array into crr
        for (int i = 0; i < n; i++) {
            crr[i] = arr[i];
        }

        // Merging the second array into crr
        for (int i = 0; i < m; i++) {
            crr[n + i] = brr[i];
        }

        System.out.println("The merged array is:");
        for (int i = 0; i < n + m; i++) {
            System.out.println(crr[i]);
        }

        sc.close();
    }
}
