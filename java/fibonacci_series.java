public class fibonacci_series {
    public static void main(String[] args)
    {
        int n=20;
        int x=0,y=1,z=0;
        while(z<=n)
        {
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }

    }
}
