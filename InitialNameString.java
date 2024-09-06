import java.util.*;
public class InitialNameString {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a Name:");
        str= sc.nextLine();
        String str1="";
        
        str= ' '+str;
        int m= str.lastIndexOf(' ');
        String str2 = str.substring(m+1);
        String str3 = str.substring(0,m);

        for(int i=0; i<str3.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                str1= str1 + str3.charAt(i+1) + ".";
            }
        }
        str1= str1+ str2;
        System.out.println(str1);
       
    }   
}
