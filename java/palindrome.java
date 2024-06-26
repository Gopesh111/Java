import java.util.*;
public class palindrome {
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter number");
    int n=s.nextInt();
    int a=n;
    int rev=0;
    while(n>0)
    {
        rev=n%10+rev*10;
         n=n/10;
    }
    if(a==rev)
    {
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not palindrome");
    }
}
}
