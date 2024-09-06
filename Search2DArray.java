import java.util.*;
public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Dimensions: ");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the number to be searched:");
        int x= sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr[i][j]== x)
                {
                    System.out.println("Element found at position ("+(i+1)+", "+(j+1)+")");
                    flag =1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Element not found");
        }
             
        
    }
}
