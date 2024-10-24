public class primenumber {
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
        System.out.println(prime(20));
    }
}
