import java.io.*;
import java.util.*;
import java.lang.*;

public class pal 
{

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sub1 = new StringBuilder();  
        sub1.append(A); 
        sub1=sub1.reverse();
        String sub=sub1.toString();
        if(sub.equals(A))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}



