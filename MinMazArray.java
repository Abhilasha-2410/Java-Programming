import java.util.*;
public class MinMazArray {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the values: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<n;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Minimum element in the array is: "+min);
        System.out.println("Maximum element in the array is: "+max);
    }
    
}
