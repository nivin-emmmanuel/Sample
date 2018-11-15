//You are given an integer N. You need to print the series of all prime numbers till N
import java.util.*;
class first
{
    static int prime(int n)
    {
        int flag=1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            return n;    
        }
        return 0;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter the limit:  ");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            int c=prime(i);
            if(c==i)
            {
                System.out.print(i+" ");
             }
            
        }
        
        
    }
}