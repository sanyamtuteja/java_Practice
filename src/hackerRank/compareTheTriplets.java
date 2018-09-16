package hackerRank;


	import java.io.*;
	import java.math.*;
	import java.text.*;
	import java.util.*;
	import java.util.regex.*;

	public class compareTheTriplets {

	    /*
	     * Complete the solve function below.
	     */
	    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
	       
	        int[] a= {a0, a1, a2};
	        int[] b= {b0, b1, b2};
	        int[] resultAB = new int[2];        
	        
	        for(int i=0; i<3;i++)
	        {
	            if (a[i]>b[i])
	            {
	                resultAB[0]++;
	            }
	            else if (a[i]<b[i])
	            {
	                resultAB[1]++;
	                               
	            }
	        }	
	    	return resultAB;
	    }
	    

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	System.out.println("enter");
	        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));

	        String[] a0A1A2 = scan.nextLine().split(" ");

	        int a0 = Integer.parseInt(a0A1A2[0].trim());

	        int a1 = Integer.parseInt(a0A1A2[1].trim());

	        int a2 = Integer.parseInt(a0A1A2[2].trim());

	        String[] b0B1B2 = scan.nextLine().split(" ");

	        int b0 = Integer.parseInt(b0B1B2[0].trim());

	        int b1 = Integer.parseInt(b0B1B2[1].trim());

	        int b2 = Integer.parseInt(b0B1B2[2].trim());

	        int[] result = solve(a0, a1, a2, b0, b1, b2);

	        for (int resultItr = 0; resultItr < result.length; resultItr++) {
	            bw.write(String.valueOf(result[resultItr]));

	            if (resultItr != result.length - 1) {
	                bw.write(" ");
	            }
	        }

	        bw.newLine();

	        bw.close();
	    }
	}