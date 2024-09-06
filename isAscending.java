import java.util.*;
public class isAscending {
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
        boolean flag=true;
        for(int i=0;i<n-1;i++)
        {
            if( arr[i]> arr[i+1])
            {
                flag=false;
            }
        }
        if(flag)
        {
            System.out.println("This is in Ascending Order");
        }
        else{
            System.out.println("This is not in Ascending Order");
        }
    } 
}
