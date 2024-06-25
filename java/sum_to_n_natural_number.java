import java.util.*;
class A
{
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        n=s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;        }
    
    System.out.println("sum is "+sum);
    }
}