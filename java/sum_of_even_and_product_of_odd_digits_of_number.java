class H
{
  public static void main(String[] args)
  {
    int n=2345;
    int sum=0;
    int product=1;
    while(n>0)
    {
        int d=n%10;
        if(d%2==0)
        {
            sum+=d;
        }
        else{
            product*=d;
        }
        n=n/10;
    }
    System.out.println(sum);
    System.out.println(product);

  }  
}