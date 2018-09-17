package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class beautifulDaysAtTheMovie {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
    	
    	int count = 0;
    	
    	for(int a=i; a<=j;a++) {
    		//System.out.println(a);
    		int reverse = reverseNumber(a);
    		int sum = 0;
    		
    		//System.out.println(reverse);
    		
    		int temp = Math.abs(a - reverse);
    		if (temp%k == 0) {
    			count ++;
    		}
    		
    	}
    	System.out.println(count);
    	return count;
    }

    public static int reverseNumber(int a) {
		
    	int reverse = 0;
        while(a != 0){
            reverse = (reverse*10)+(a%10);
            a = a/10;
        } 
        return reverse;   	
    }
    
    
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));
        System.out.println("Enter");
        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

