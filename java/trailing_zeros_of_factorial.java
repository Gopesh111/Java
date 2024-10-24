class C {
    static int fact(int num)
    {
        int f=1;
        int count=0;
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        while(f%10==0)
        {
            count++;
            f=f/10;
        }

return count;
    }
    public static void main(String[] args) {
        System.err.println(fact(2));
    }
}

