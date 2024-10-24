class A{
 static void printingprime(int num)
 {
    for(int i=2;i<=num;i++)
    {
        if(prime(i))
        {
            System.out.println(i);
        }
    }
 }
 static boolean prime(int num)
    {
        int count=0;
        for(int i=2;i<num;i++)
        {
           if(num%i==0)
           {
            count++;
            break;
           }
        }
        if(count>0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        printingprime(10);
        
    }
}
