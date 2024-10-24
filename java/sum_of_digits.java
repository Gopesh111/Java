public class sum_of_digits {
    public static void main(String[] args)
    {
        int s=129;
        int sum=0;
       while(s>0)
       {
        sum=sum+s%10;
        s=s/10;
       }
       while(sum>=10)
       {
        int tempsum=0;
        while(sum>0)
        {
            tempsum+=sum%10;
            sum=sum/10;
        }
        sum=tempsum;
       }
       System.out.print(sum);
    }
}