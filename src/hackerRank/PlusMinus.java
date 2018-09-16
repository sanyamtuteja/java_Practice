package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
    	double negative=0;
    	double positive=0;
    	double zero=0;
    	double length=arr.length;
    	for (int i=0; i<arr.length; i++){
    		if (arr[i]>0)
    		{
    		positive++;
    		}
    		if(arr[i]<0)
    		{
    			negative++;
    		}
    		else 
    		{
    			zero++;
    		}
    		   		
    	}
    	double p = positive/length;
    	double n = negative/length;
    	double z = zero/length;
    	System.out.printf("%.6f %n",p);
    	System.out.printf("%.6f %n",n);
    	System.out.printf("%.6f %n",z);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("enter");

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
