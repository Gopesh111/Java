import java.util.*;
class max{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int a=s.nextInt();
        System.out.println("Enter number");
        int b=s.nextInt();
        System.out.println("Enter number");
        int c=s.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is max");
        }
        else if(b>c && b>a)
        {
            System.out.println(b+ " is max");
        }
        else if(c>a && c>b)
        {
            System.out.println(c+ " is max");
        }
    }
}