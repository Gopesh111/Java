import java.util.Scanner;
class B
{
    static boolean palindrome(int n)
    {
        int rev=0;
        int org=n;
        while(n>0)
        {
          int last=n%10;
          rev=(rev*10)+last;
          n=n/10;
        }
        return org==rev;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(palindrome(num));
    }
}
