import java.io.*;
import java.util.*;
class third
{
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String s = sc.next();
            int v = 0;     
            int l = 0;   
            for(char c : s.toCharArray())
            {
                if(c == 'U') ++l;
                if(c == 'D') --l;
                if(l == 0 && c == 'U')
                    ++v;
            }
            System.out.print(v); 
    }
}