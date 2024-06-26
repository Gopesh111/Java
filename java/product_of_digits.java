public class product_of_digits {
    public static void main(String[] args)
    {
        int n=123;
        int p=1;
        while(n>0)
        {
            int a=n%10;
            p=p*a;
            n=n/10;
        }
        System.out.println(p);
    }
    
}
