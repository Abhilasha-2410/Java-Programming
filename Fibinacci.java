import java.util.*;
public class Fibinacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        System.out. print(a+ " ");
        System.out. print(b+ " ");
        if(n>0)
        {
            for(int i=2; i<=n; i++){
                c = a + b;
                System.out.print(c+" ");
                a = b;
                b = c;      
            }
        }
    }
}
