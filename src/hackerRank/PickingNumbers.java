package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PickingNumbers {

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {
    	
    	int Currcount = 0;
    	int Highestcount = 0;

    	Arrays.sort(a);
    	/*for(int i = 0; i < a.length; i++) {
    	System.out.println(a[i]);
    	}
    	*/
    	for(int i = 0; i < a.length; i++) {
    		Currcount = 0;
    		for (int j=0; j <= i; j++){
    			int temp = a[i]-a[j];
    		
    			if( Math.abs(temp) <= 1 ){
    				Currcount++;
    				if(Currcount> Highestcount) {
    					Highestcount = Currcount;
    			}
    		}
		}
    	
    	}System.out.println(Highestcount);

    	return Highestcount;
		
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));
        System.out.println("Enter");
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
