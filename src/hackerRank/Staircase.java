package hackerRank;

import java.util.Scanner;

public class Staircase {

	 /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
    	int i, j, k=n-1;
    	 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=0; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
             
            // decrementing k after each loop
            k = k - 1;
             
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("#");
            }
             
            // ending line after each row
            System.out.println();
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("enter");
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }

}
