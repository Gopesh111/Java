
class hello
{
    public static void main(String[] args) {
        System.out.print(euc(5,10));
    }

public static int euc(int a,int b)
{
    if(a==0)
    {
        return b;
    }
    return euc(b%a,a);}
}