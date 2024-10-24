
class hcf {
    static int gcd(int a,int b)
    {
        int res=1;
        for(int i=1;i<=Math.min(a,b);i++)
        {
            if((a%i==0) && (b%i==0))
            {
                res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.err.println(gcd(1,5));
    }
}
