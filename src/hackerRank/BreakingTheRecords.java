package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingTheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {


    	int n = scores.length;
    	int max = scores[0];
    	int min = scores[0];
    	int mincount = 0;
    	int maxcount = 0;
    	
    	
    	System.out.println("abc");
    	
    	//3 4 21 36 10 28 35 5 24 42
    	// 12,24,10,24

    	for (int i=1; i<n;i++){
    		if(scores[i] > max ){
    			max = scores[i];
    			maxcount++;
    			System.out.println("max" +max +maxcount);
    		}else if(scores[i] < min ){
    			min = scores[i];
    			mincount++;
    			System.out.println(min + mincount);
    		}	
    	}
    	int[] arr = {maxcount, mincount};
    	return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));
        System.out.println("Enter");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

