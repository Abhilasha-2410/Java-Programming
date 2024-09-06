public class Pattern12 {
    public static void main(String[] args) {
        for(int i=1; i<6; i++)
        {
            for(int j= 5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k= 1; k<=i; k++)
            {
                System.out.print("*");
            }
            for(int l= 1; l<i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<5; i++)
        {
            for(int j= 1; j<i+1; j++)
            {
                System.out.print(" ");
            }
            for(int k= 4; k>=i; k--)
            {
                System.out.print("*");
            }
            for(int l=i; l<4; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

