import java.util.*;
public class createEmail {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a EmailId:");
        str= sc.nextLine();
        String userId="";

        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)=='@')
            {
                userId= str.substring(0,i);
                break;
            }
        }
        System.out.println("The userId is: " + userId);
    }
    
}
