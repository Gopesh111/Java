//add,sub,multiply,divide of two numbers based on users choice
import java.util.*;
public class calculator {
    public static void main(String[] args)
    {
        System.out.println("enter 1 for add");
        System.out.println("enter 2 for sub");
        System.out.println("enter 3 for mul");
        System.out.println("enter 4 for div");
        int a;
        int b=10,c=20;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a==1)
        {
            System.out.println(b+c);
        }
        if(a==2)
        {
            System.out.println(b*c);
        }
        if(a==3)
        {
            System.out.println(b-c);
        }
        if(a==4)
        {
            System.out.println(b/c);
        }
    }
}
