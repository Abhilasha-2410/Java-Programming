import java.util.*;
public class replaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a String:");
        str= sc.nextLine();
        String result = "";
        // for(int i=0; i<str.length();i++)
        // {
        //     if(str.charAt(i)=='e')
        //     {
        //         result = result + "i";
        //     }
        //     else{
        //         result = result + str.charAt(i);
        //     }
        // }
        result= str.replace('e','i');
        System.out.println("The string: "+ result);
    }
}

