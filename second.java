//You need to print the series of n prime numbers 
import java.util.*;
class second
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
        System.out.println("Enter the limit:  ");
        int count=sc.nextInt();
        for(int i=2;count>=1;i++)
        {
            int c=prime(i);
            if(c==i)
            {
                System.out.print(i+" ");
                count--;
             }
            
        }
        
        
    }
}