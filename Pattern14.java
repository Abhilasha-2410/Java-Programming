public class Pattern14 {
    public static void main(String[] args) {
        for(int i=1; i<6; i++)
        {
            for(int j= 5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k= i; k>=1; k--)
            {
                System.out.print(k);
            }
            for(int l= 1; l<i; l++)
            {
                System.out.print(l+1);
            }
            System.out.println();
        }
    }
}
