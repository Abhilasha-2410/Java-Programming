import java.util.*;

public class AlternateMerge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input sizes of the two arrays
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        
        int arr[] = new int[n];
        int brr[] = new int[m];
        int crr[] = new int[n + m]; // Array to store the merged result

        // Input elements of the first array
        System.out.println("Enter the numbers in the first array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input elements of the second array
        System.out.println("Enter the numbers in the second array:");
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        // Merging arrays in alternate fashion
        int i = 0, j = 0, k = 0;
        while (i < n || j < m) {
            if (i < n) {
                crr[k++] = arr[i++];
            }
            if (j < m) {
                crr[k++] = brr[j++];
            }
        }

        // Output the merged array
        System.out.println("The merged array in alternate fashion is:");
        for (int x = 0; x < n + m; x++) {
            System.out.println(crr[x]);
        }

        sc.close();
    }
}
 