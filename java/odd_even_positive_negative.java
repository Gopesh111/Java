import java.util.*;
class odd
{
    public static void main(String[] args)
    {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0 && a>0)
        {
            System.out.println("even and positive");
        }
        if(a%2==0 && a<0)
        {
            System.out.println("even and negative");
        }
        if(a%2!=0 && a>0)
        {
            System.out.println("odd and positive");
        }
        if(a%2!=0 && a<0)
        {
            System.out.println("odd and negative");
        }
    }
}
