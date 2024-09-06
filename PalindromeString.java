import java.util.*;
public class PalindromeString {
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
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
