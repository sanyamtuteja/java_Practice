package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	
    	String result = null;
    		int a_dist = Math.abs(z-x);
    		int b_dist = Math.abs(z-y);
    		System.out.println(a_dist);
    		System.out.println(b_dist);
    		
    		if (a_dist == b_dist){
    			result = "Mouse C";
    		}else if (a_dist < b_dist){
    			result = "Cat A";
    		}else {
    			result = "Cat B";    			
    		}
    		System.out.println(result);
    		return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));
        System.out.println("Enter");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
