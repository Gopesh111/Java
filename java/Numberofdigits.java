import java.util.Scanner;
class A
{
    static int noofdigits(int num)
    {
        int count =0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(noofdigits(n));
    }
}