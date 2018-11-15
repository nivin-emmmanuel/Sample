//John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
//Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution 
{
    static int sockMerchant(int n, int[] ar) 
    {
        int pair=0;
        Arrays.sort(ar);
        for(int i=0;i<n-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                pair++;
                i++;
            }
        }
        return pair;
    }
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
