import java.util.*;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a String:");
        str= sc.nextLine();
        String rev="";
        int l = str.length();
        for(int i=l-1; i>=0; i--)
        {
            rev= rev+ str.charAt(i);
        }
        System.out.println(rev);
    }
}
