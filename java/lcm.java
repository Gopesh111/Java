 class l {
    static int lcm(int a,int b)
    {
        int res=1;
        for(int i=1;i<a*b;i++)
        {
            if((i%a==0) && (i%b==0))
            {
                res=i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(lcm(12,15));
    }
}
