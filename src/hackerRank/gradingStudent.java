package hackerRank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class gradingStudent {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) 
    {

    	for(int i = 0; i<grades.length; i++)
    	{
    		int temp = grades[i]%5;
    		if(temp >= 3 && grades[i]>=38)
    		{
    			grades[i]=grades[i]+(5-temp);
    		}
    		
        	
    	}
    	for(int i = 0; i<grades.length; i++){
			System.out.println(grades[i]);
        	}
    	
    	
    	
    	return grades;



    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("enter");

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
