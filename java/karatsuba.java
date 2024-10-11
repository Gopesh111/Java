public class karatsuba {
    public static void main(String[] args)
    {
    System.out.print(mul(1520,2050));
}
static long mul(long a,long b) 
{
if(a<10 || b<10)
{
    return a*b;
}

    int length=Math.max(Long.toString(a).length(),Long.toString(b).length());
    int hlength=length/2;
    long maxa=a/(long)Math.pow(10,hlength);
    long mina=a%(long)Math.pow(10,hlength);
    long maxb=b/(long)Math.pow(10,hlength);
    long minb=b%(long)Math.pow(10,hlength);
    long ac=mul(maxa,maxb);
    long bd=mul(mina,minb);
    long ab_cd=mul(mina+maxa,minb+maxb)-ac-bd;
    return (long)(ac*Math.pow(10,2*hlength)+ab_cd*Math.pow(10,hlength)+bd);

}

}
