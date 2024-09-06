import java.util.*;

public class AlternateMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        
        int arr[] = new int[n];
        int brr[] = new int[m];

        System.out.println("Enter the numbers in the first array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the numbers in the second array:");
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        System.out.println("The merged array in alternate fashion is:");

        // Print elements in alternate fashion
        int i = 0, j = 0;
        while (i < n || j < m) {
            if (i < n) {
                System.out.println(arr[i]);
                i++;
            }
            if (j < m) {
                System.out.println(brr[j]);
                j++;
            }
        }

        sc.close();
    }
}
