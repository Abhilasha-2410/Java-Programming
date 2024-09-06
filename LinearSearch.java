import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers:");
        for (int i= 0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int num = sc.nextInt();
        int count = 0;

        for(int i= 0; i<n; i++)
        {
            if(num == arr[i])
            {
                System.out.println("Number found at position "+(i+1));
                count++;
            } 
        }
        if(count == 0)
        {
            System.out.println("Number not found");
        }
    }
}
