package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class diagonaldifference {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDiff(int[][] a) {
        
        int sumdiagonal1 = 0;
            for(int i=0;i<a.length;i++){
                int j=i;
                sumdiagonal1+=a[i][j];
    }
        System.out.println(sumdiagonal1);
        
        int sumdiagonal2 = 0;
        int j = a.length-1;
            for(int i=0;i<a.length;i++){
                sumdiagonal2+=a[i][j];
                
                j=j-1;                
    }
            
            System.out.println(sumdiagonal2);
			return Math.abs(sumdiagonal1-sumdiagonal2);
    }        
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("enter");

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDiff(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
