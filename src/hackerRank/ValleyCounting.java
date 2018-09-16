package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ValleyCounting {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	
    	int valleys = 0;
    	int level = 0;
    	boolean belowSea = false;
    	for (int i =0; i<s.length(); i++){
    		char c = s.charAt(i);
    		if (c == 'U')
    			level++;
    		else
    			level--;
    		
    		if(!belowSea && level < 0)
            {
                valleys++;
                belowSea = true;
            }
            
            if(level >= 0)//We are back above sea level
                belowSea = false;
        }
    	System.out.println(valleys);

    	return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));
        System.out.println("Enter");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
