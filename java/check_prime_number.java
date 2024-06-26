public class check_prime_number {
    public static void main(String[] args)
    {
        int n=4,c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
c++;
            }
        }
        if(c>0)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
    
}
