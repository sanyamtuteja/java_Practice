package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class KangarooCircus {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
/*
    	String str = null;
    	
    	if(x2>x1 && v2> v1)
    	{
            System.out.println("NO");
        }
    	else
    	{
            while(x2 > x1)
            {
                x2 = x2 + v2;
                x1 = x1 + v1;
 
                if(x1 == x2)
                {
                    str = "YES";
                    break;
                }
 
                if(x1 > x2){
                    str="NO";
                    break;
                }
            }
        }
    	return str;
    }    */
  System.out.println("abc");
    String str = null;
   
    if(v1 < v2) {
	   str = "NO";
   }
    if(x1 < x2 && v1 > v2) 
    {
        int xDiff = Math.abs(x1 - x2);
        int vDiff = Math.abs(v1 - v2);
        
        if(xDiff % vDiff == 0) {
            str = "YES";
        } else 
        {
            str = "NO";
        }
    }
    return str;
}
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));
        System.out.println("enter");
        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
