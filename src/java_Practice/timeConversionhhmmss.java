package java_Practice;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class timeConversionhhmmss {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	   int hrs = 12;
    	    int min = 00;
    	    int sec = 00;
    	   
    	    String[] str = s.split(":");

    	    int Hours = Integer.parseInt(str[0]);
    	   String ss= s.substring(8);
    	   System.out.println(ss);
    	    if(ss.equals("PM")){
    	    
    	    	Hours=Hours + hrs;
    	   
    	    }
    	    String finalHrs = Integer.toString(Hours);
    	    System.out.println(finalHrs);
    	    return finalHrs;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("enter");

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
